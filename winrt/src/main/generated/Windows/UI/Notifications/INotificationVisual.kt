package Windows.UI.Notifications

import Windows.Foundation.Collections.IVector
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

@ABIMarker(INotificationVisual.ABI::class)
@Signature("{68835b8e-aa56-4e11-86d3-5f9a6957bc5b}")
@Guid("68835b8eaa564e1186d35f9a6957bc5b")
@WinRTInterface("68835b8eaa564e1186d35f9a6957bc5b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INotificationVisual.ByReference::class)
public interface INotificationVisual : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Language(): String?

  @InterfaceMethod(1)
  public fun put_Language(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_Bindings(): IVector<NotificationBinding?>?

  @InterfaceMethod(3)
  public fun GetBinding(templateName: String?): NotificationBinding?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INotificationVisual> {
    public override fun getValue() = ABI.makeINotificationVisual(pointer.getPointer(0))

    public fun setValue(value: INotificationVisual_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INotificationVisual {
    public val __612321157_Ptr: Pointer?

    public val _612321157_VtblPtr: Pointer?
      get() = __612321157_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Language(): String? {
      val fnPtr = _612321157_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__612321157_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Language(value: String?): Unit {
      val fnPtr = _612321157_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__612321157_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Bindings(): IVector<NotificationBinding?>? {
      val fnPtr = _612321157_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<NotificationBinding?>>()
      val hr = fn.invokeHR(arrayOf(__612321157_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<NotificationBinding?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetBinding(templateName: String?): NotificationBinding? {
      val fnPtr = _612321157_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NotificationBinding>()
      val hr = fn.invokeHR(arrayOf(__612321157_Ptr, marshalToNative(templateName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NotificationBinding>(result.getValue())
      return resultValue
    }
  }

  public class INotificationVisual_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __612321157_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INotificationVisual, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("68835b8eaa564e1186d35f9a6957bc5b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINotificationVisual(ptr: Pointer?): WithDefault = INotificationVisual_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INotificationVisual {
      val address = segment.toRawLongValue()
      return makeINotificationVisual(Pointer(address))
    }

    public override fun toNative(obj: INotificationVisual): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__612321157_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INotificationVisual): Array<INotificationVisual?> =
        (elements as
        Array<INotificationVisual?>).castToImpl<INotificationVisual,INotificationVisual_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INotificationVisual?> =
        arrayOfNulls<INotificationVisual_Impl>(size) as Array<INotificationVisual?>
  }
}
