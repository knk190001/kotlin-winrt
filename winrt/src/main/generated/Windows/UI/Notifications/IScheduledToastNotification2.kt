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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IScheduledToastNotification2.ABI::class)
@Signature("{a66ea09c-31b4-43b0-b5dd-7a40e85363b1}")
@Guid("a66ea09c31b443b0b5dd7a40e85363b1")
@WinRTInterface("a66ea09c31b443b0b5dd7a40e85363b1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IScheduledToastNotification2.ByReference::class)
public interface IScheduledToastNotification2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_Tag(value: String?): Unit

  @InterfaceMethod(1)
  public fun get_Tag(): String?

  @InterfaceMethod(2)
  public fun put_Group(value: String?): Unit

  @InterfaceMethod(3)
  public fun get_Group(): String?

  @InterfaceMethod(4)
  public fun put_SuppressPopup(value: Boolean): Unit

  @InterfaceMethod(5)
  public fun get_SuppressPopup(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IScheduledToastNotification2> {
    public override fun getValue() = ABI.makeIScheduledToastNotification2(pointer.getPointer(0))

    public fun setValue(value: IScheduledToastNotification2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IScheduledToastNotification2 {
    public val __1189128483_Ptr: Pointer?

    public val _1189128483_VtblPtr: Pointer?
      get() = __1189128483_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_Tag(value: String?): Unit {
      val fnPtr = _1189128483_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1189128483_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_Tag(): String? {
      val fnPtr = _1189128483_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1189128483_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_Group(value: String?): Unit {
      val fnPtr = _1189128483_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1189128483_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_Group(): String? {
      val fnPtr = _1189128483_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1189128483_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_SuppressPopup(value: Boolean): Unit {
      val fnPtr = _1189128483_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1189128483_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_SuppressPopup(): Boolean {
      val fnPtr = _1189128483_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1189128483_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IScheduledToastNotification2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1189128483_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IScheduledToastNotification2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a66ea09c31b443b0b5dd7a40e85363b1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIScheduledToastNotification2(ptr: Pointer?): WithDefault =
        IScheduledToastNotification2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IScheduledToastNotification2 {
      val address = segment.toRawLongValue()
      return makeIScheduledToastNotification2(Pointer(address))
    }

    public override fun toNative(obj: IScheduledToastNotification2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1189128483_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IScheduledToastNotification2):
        Array<IScheduledToastNotification2?> = (elements as
        Array<IScheduledToastNotification2?>).castToImpl<IScheduledToastNotification2,IScheduledToastNotification2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IScheduledToastNotification2?> =
        arrayOfNulls<IScheduledToastNotification2_Impl>(size) as
        Array<IScheduledToastNotification2?>
  }
}
