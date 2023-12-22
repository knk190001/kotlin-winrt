package Microsoft.Windows.ApplicationModel.Resources

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

@ABIMarker(IKnownResourceQualifierNameStatics.ABI::class)
@Signature("{dd6cdedc-559b-50c8-ac53-82fe21f915f3}")
@Guid("dd6cdedc559b50c8ac5382fe21f915f3")
@WinRTInterface("dd6cdedc559b50c8ac5382fe21f915f3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IKnownResourceQualifierNameStatics.ByReference::class)
public interface IKnownResourceQualifierNameStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Contrast(): String?

  @InterfaceMethod(1)
  public fun get_Custom(): String?

  @InterfaceMethod(2)
  public fun get_DeviceFamily(): String?

  @InterfaceMethod(3)
  public fun get_HomeRegion(): String?

  @InterfaceMethod(4)
  public fun get_Language(): String?

  @InterfaceMethod(5)
  public fun get_LayoutDirection(): String?

  @InterfaceMethod(6)
  public fun get_Scale(): String?

  @InterfaceMethod(7)
  public fun get_TargetSize(): String?

  @InterfaceMethod(8)
  public fun get_Theme(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IKnownResourceQualifierNameStatics> {
    public override fun getValue() =
        ABI.makeIKnownResourceQualifierNameStatics(pointer.getPointer(0))

    public fun setValue(value: IKnownResourceQualifierNameStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IKnownResourceQualifierNameStatics {
    public val __954286451_Ptr: Pointer?

    public val _954286451_VtblPtr: Pointer?
      get() = __954286451_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Contrast(): String? {
      val fnPtr = _954286451_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__954286451_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Custom(): String? {
      val fnPtr = _954286451_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__954286451_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_DeviceFamily(): String? {
      val fnPtr = _954286451_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__954286451_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_HomeRegion(): String? {
      val fnPtr = _954286451_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__954286451_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_Language(): String? {
      val fnPtr = _954286451_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__954286451_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_LayoutDirection(): String? {
      val fnPtr = _954286451_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__954286451_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_Scale(): String? {
      val fnPtr = _954286451_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__954286451_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_TargetSize(): String? {
      val fnPtr = _954286451_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__954286451_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_Theme(): String? {
      val fnPtr = _954286451_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__954286451_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IKnownResourceQualifierNameStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __954286451_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IKnownResourceQualifierNameStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("dd6cdedc559b50c8ac5382fe21f915f3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIKnownResourceQualifierNameStatics(ptr: Pointer?): WithDefault =
        IKnownResourceQualifierNameStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IKnownResourceQualifierNameStatics {
      val address = segment.toRawLongValue()
      return makeIKnownResourceQualifierNameStatics(Pointer(address))
    }

    public override fun toNative(obj: IKnownResourceQualifierNameStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__954286451_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IKnownResourceQualifierNameStatics):
        Array<IKnownResourceQualifierNameStatics?> = (elements as
        Array<IKnownResourceQualifierNameStatics?>).castToImpl<IKnownResourceQualifierNameStatics,IKnownResourceQualifierNameStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IKnownResourceQualifierNameStatics?> =
        arrayOfNulls<IKnownResourceQualifierNameStatics_Impl>(size) as
        Array<IKnownResourceQualifierNameStatics?>
  }
}
