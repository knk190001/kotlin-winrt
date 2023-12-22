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

@ABIMarker(IKnownNotificationBindingsStatics.ABI::class)
@Signature("{79427bae-a8b7-4d58-89ea-76a7b7bccded}")
@Guid("79427baea8b74d5889ea76a7b7bccded")
@WinRTInterface("79427baea8b74d5889ea76a7b7bccded")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IKnownNotificationBindingsStatics.ByReference::class)
public interface IKnownNotificationBindingsStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ToastGeneric(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IKnownNotificationBindingsStatics> {
    public override fun getValue() =
        ABI.makeIKnownNotificationBindingsStatics(pointer.getPointer(0))

    public fun setValue(value: IKnownNotificationBindingsStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IKnownNotificationBindingsStatics {
    public val __2012136423_Ptr: Pointer?

    public val _2012136423_VtblPtr: Pointer?
      get() = __2012136423_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ToastGeneric(): String? {
      val fnPtr = _2012136423_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2012136423_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IKnownNotificationBindingsStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2012136423_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IKnownNotificationBindingsStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("79427baea8b74d5889ea76a7b7bccded")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIKnownNotificationBindingsStatics(ptr: Pointer?): WithDefault =
        IKnownNotificationBindingsStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IKnownNotificationBindingsStatics {
      val address = segment.toRawLongValue()
      return makeIKnownNotificationBindingsStatics(Pointer(address))
    }

    public override fun toNative(obj: IKnownNotificationBindingsStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2012136423_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IKnownNotificationBindingsStatics):
        Array<IKnownNotificationBindingsStatics?> = (elements as
        Array<IKnownNotificationBindingsStatics?>).castToImpl<IKnownNotificationBindingsStatics,IKnownNotificationBindingsStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IKnownNotificationBindingsStatics?> =
        arrayOfNulls<IKnownNotificationBindingsStatics_Impl>(size) as
        Array<IKnownNotificationBindingsStatics?>
  }
}
