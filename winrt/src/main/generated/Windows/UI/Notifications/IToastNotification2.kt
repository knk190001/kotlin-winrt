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

@ABIMarker(IToastNotification2.ABI::class)
@Signature("{9dfb9fd1-143a-490e-90bf-b9fba7132de7}")
@Guid("9dfb9fd1143a490e90bfb9fba7132de7")
@WinRTInterface("9dfb9fd1143a490e90bfb9fba7132de7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IToastNotification2.ByReference::class)
public interface IToastNotification2 : NativeMapped, IWinRTInterface {
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
      IByReference<IToastNotification2> {
    public override fun getValue() = ABI.makeIToastNotification2(pointer.getPointer(0))

    public fun setValue(value: IToastNotification2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IToastNotification2 {
    public val __108921296_Ptr: Pointer?

    public val _108921296_VtblPtr: Pointer?
      get() = __108921296_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_Tag(value: String?): Unit {
      val fnPtr = _108921296_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__108921296_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_Tag(): String? {
      val fnPtr = _108921296_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__108921296_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_Group(value: String?): Unit {
      val fnPtr = _108921296_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__108921296_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_Group(): String? {
      val fnPtr = _108921296_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__108921296_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_SuppressPopup(value: Boolean): Unit {
      val fnPtr = _108921296_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__108921296_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_SuppressPopup(): Boolean {
      val fnPtr = _108921296_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__108921296_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IToastNotification2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __108921296_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IToastNotification2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9dfb9fd1143a490e90bfb9fba7132de7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIToastNotification2(ptr: Pointer?): WithDefault = IToastNotification2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IToastNotification2 {
      val address = segment.toRawLongValue()
      return makeIToastNotification2(Pointer(address))
    }

    public override fun toNative(obj: IToastNotification2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__108921296_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IToastNotification2): Array<IToastNotification2?> =
        (elements as
        Array<IToastNotification2?>).castToImpl<IToastNotification2,IToastNotification2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IToastNotification2?> =
        arrayOfNulls<IToastNotification2_Impl>(size) as Array<IToastNotification2?>
  }
}
