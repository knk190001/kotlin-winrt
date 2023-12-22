package Windows.UI.Notifications

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

@ABIMarker(IKnownAdaptiveNotificationHintsStatics.ABI::class)
@Signature("{06206598-d496-497d-8692-4f7d7c2770df}")
@Guid("06206598d496497d86924f7d7c2770df")
@WinRTInterface("06206598d496497d86924f7d7c2770df")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IKnownAdaptiveNotificationHintsStatics.ByReference::class)
public interface IKnownAdaptiveNotificationHintsStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Style(): String?

  @InterfaceMethod(1)
  public fun get_Wrap(): String?

  @InterfaceMethod(2)
  public fun get_MaxLines(): String?

  @InterfaceMethod(3)
  public fun get_MinLines(): String?

  @InterfaceMethod(4)
  public fun get_TextStacking(): String?

  @InterfaceMethod(5)
  public fun get_Align(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IKnownAdaptiveNotificationHintsStatics> {
    public override fun getValue() =
        ABI.makeIKnownAdaptiveNotificationHintsStatics(pointer.getPointer(0))

    public fun setValue(value: IKnownAdaptiveNotificationHintsStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IKnownAdaptiveNotificationHintsStatics {
    public val __1148149395_Ptr: Pointer?

    public val _1148149395_VtblPtr: Pointer?
      get() = __1148149395_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Style(): String? {
      val fnPtr = _1148149395_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1148149395_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Wrap(): String? {
      val fnPtr = _1148149395_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1148149395_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_MaxLines(): String? {
      val fnPtr = _1148149395_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1148149395_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_MinLines(): String? {
      val fnPtr = _1148149395_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1148149395_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_TextStacking(): String? {
      val fnPtr = _1148149395_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1148149395_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_Align(): String? {
      val fnPtr = _1148149395_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1148149395_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IKnownAdaptiveNotificationHintsStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1148149395_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IKnownAdaptiveNotificationHintsStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("06206598d496497d86924f7d7c2770df")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIKnownAdaptiveNotificationHintsStatics(ptr: Pointer?): WithDefault =
        IKnownAdaptiveNotificationHintsStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IKnownAdaptiveNotificationHintsStatics {
      val address = segment.toRawLongValue()
      return makeIKnownAdaptiveNotificationHintsStatics(Pointer(address))
    }

    public override fun toNative(obj: IKnownAdaptiveNotificationHintsStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1148149395_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IKnownAdaptiveNotificationHintsStatics):
        Array<IKnownAdaptiveNotificationHintsStatics?> = (elements as
        Array<IKnownAdaptiveNotificationHintsStatics?>).castToImpl<IKnownAdaptiveNotificationHintsStatics,IKnownAdaptiveNotificationHintsStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IKnownAdaptiveNotificationHintsStatics?> =
        arrayOfNulls<IKnownAdaptiveNotificationHintsStatics_Impl>(size) as
        Array<IKnownAdaptiveNotificationHintsStatics?>
  }
}
