package Windows.ApplicationModel.Resources.Management

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.interop.makeByReferenceType
import com.github.knk190001.winrtbinding.runtime.interop.makeOutArray
import com.github.knk190001.winrtbinding.runtime.interop.makePrimitiveOutArray
import com.github.knk190001.winrtbinding.runtime.interop.marshalFromNative
import com.github.knk190001.winrtbinding.runtime.interop.marshalToNative
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IIndexedResourceQualifier.ABI::class)
@Signature("{dae3bb9b-d304-497f-a168-a340042c8adb}")
@Guid("dae3bb9bd304497fa168a340042c8adb")
@WinRTInterface("dae3bb9bd304497fa168a340042c8adb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IIndexedResourceQualifier.ByReference::class)
public interface IIndexedResourceQualifier : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_QualifierName(): String?

  @InterfaceMethod(1)
  public fun get_QualifierValue(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IIndexedResourceQualifier> {
    public override fun getValue() = ABI.makeIIndexedResourceQualifier(pointer.getPointer(0))

    public fun setValue(value: IIndexedResourceQualifier_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IIndexedResourceQualifier {
    public val __170794530_Ptr: Pointer?

    public val _170794530_VtblPtr: Pointer?
      get() = __170794530_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_QualifierName(): String? {
      val fnPtr = _170794530_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__170794530_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_QualifierValue(): String? {
      val fnPtr = _170794530_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__170794530_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IIndexedResourceQualifier_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __170794530_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IIndexedResourceQualifier, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("dae3bb9bd304497fa168a340042c8adb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIIndexedResourceQualifier(ptr: Pointer?): WithDefault =
        IIndexedResourceQualifier_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IIndexedResourceQualifier {
      val address = segment.toRawLongValue()
      return makeIIndexedResourceQualifier(Pointer(address))
    }

    public override fun toNative(obj: IIndexedResourceQualifier): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__170794530_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IIndexedResourceQualifier):
        Array<IIndexedResourceQualifier?> = (elements as
        Array<IIndexedResourceQualifier?>).castToImpl<IIndexedResourceQualifier,IIndexedResourceQualifier_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IIndexedResourceQualifier?> =
        arrayOfNulls<IIndexedResourceQualifier_Impl>(size) as Array<IIndexedResourceQualifier?>
  }
}
