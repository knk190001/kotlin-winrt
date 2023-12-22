package Windows.ApplicationModel.Resources.Core

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
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IResourceQualifier.ABI::class)
@Signature("{785da5b2-4afd-4376-a888-c5f9a6b7a05c}")
@Guid("785da5b24afd4376a888c5f9a6b7a05c")
@WinRTInterface("785da5b24afd4376a888c5f9a6b7a05c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IResourceQualifier.ByReference::class)
public interface IResourceQualifier : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_QualifierName(): String?

  @InterfaceMethod(1)
  public fun get_QualifierValue(): String?

  @InterfaceMethod(2)
  public fun get_IsDefault(): Boolean

  @InterfaceMethod(3)
  public fun get_IsMatch(): Boolean

  @InterfaceMethod(4)
  public fun get_Score(): Double

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IResourceQualifier> {
    public override fun getValue() = ABI.makeIResourceQualifier(pointer.getPointer(0))

    public fun setValue(value: IResourceQualifier_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IResourceQualifier {
    public val __662052773_Ptr: Pointer?

    public val _662052773_VtblPtr: Pointer?
      get() = __662052773_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_QualifierName(): String? {
      val fnPtr = _662052773_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__662052773_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_QualifierValue(): String? {
      val fnPtr = _662052773_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__662052773_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_IsDefault(): Boolean {
      val fnPtr = _662052773_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__662052773_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_IsMatch(): Boolean {
      val fnPtr = _662052773_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__662052773_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_Score(): Double {
      val fnPtr = _662052773_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__662052773_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }
  }

  public class IResourceQualifier_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __662052773_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IResourceQualifier, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("785da5b24afd4376a888c5f9a6b7a05c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIResourceQualifier(ptr: Pointer?): WithDefault = IResourceQualifier_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IResourceQualifier {
      val address = segment.toRawLongValue()
      return makeIResourceQualifier(Pointer(address))
    }

    public override fun toNative(obj: IResourceQualifier): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__662052773_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IResourceQualifier): Array<IResourceQualifier?> =
        (elements as
        Array<IResourceQualifier?>).castToImpl<IResourceQualifier,IResourceQualifier_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IResourceQualifier?> =
        arrayOfNulls<IResourceQualifier_Impl>(size) as Array<IResourceQualifier?>
  }
}
