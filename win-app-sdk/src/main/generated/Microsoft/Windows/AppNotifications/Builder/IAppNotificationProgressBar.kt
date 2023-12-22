package Microsoft.Windows.AppNotifications.Builder

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
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAppNotificationProgressBar.ABI::class)
@Signature("{fced62f2-2074-5641-8630-87a14315ac86}")
@Guid("fced62f220745641863087a14315ac86")
@WinRTInterface("fced62f220745641863087a14315ac86")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppNotificationProgressBar.ByReference::class)
public interface IAppNotificationProgressBar : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Title(): String?

  @InterfaceMethod(1)
  public fun put_Title(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_Status(): String?

  @InterfaceMethod(3)
  public fun put_Status(value: String?): Unit

  @InterfaceMethod(4)
  public fun get_Value(): Double

  @InterfaceMethod(5)
  public fun put_Value(value: Double): Unit

  @InterfaceMethod(6)
  public fun get_ValueStringOverride(): String?

  @InterfaceMethod(7)
  public fun put_ValueStringOverride(value: String?): Unit

  @InterfaceMethod(8)
  public fun SetTitle(value: String?): AppNotificationProgressBar?

  @InterfaceMethod(9)
  public fun BindTitle(): AppNotificationProgressBar?

  @InterfaceMethod(10)
  public fun SetStatus(value: String?): AppNotificationProgressBar?

  @InterfaceMethod(11)
  public fun BindStatus(): AppNotificationProgressBar?

  @InterfaceMethod(12)
  public fun SetValue(value: Double): AppNotificationProgressBar?

  @InterfaceMethod(13)
  public fun BindValue(): AppNotificationProgressBar?

  @InterfaceMethod(14)
  public fun SetValueStringOverride(value: String?): AppNotificationProgressBar?

  @InterfaceMethod(15)
  public fun BindValueStringOverride(): AppNotificationProgressBar?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppNotificationProgressBar> {
    public override fun getValue() = ABI.makeIAppNotificationProgressBar(pointer.getPointer(0))

    public fun setValue(value: IAppNotificationProgressBar_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppNotificationProgressBar {
    public val __1606063644_Ptr: Pointer?

    public val _1606063644_VtblPtr: Pointer?
      get() = __1606063644_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Title(): String? {
      val fnPtr = _1606063644_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1606063644_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Title(value: String?): Unit {
      val fnPtr = _1606063644_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1606063644_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Status(): String? {
      val fnPtr = _1606063644_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1606063644_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Status(value: String?): Unit {
      val fnPtr = _1606063644_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1606063644_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Value(): Double {
      val fnPtr = _1606063644_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1606063644_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_Value(value: Double): Unit {
      val fnPtr = _1606063644_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1606063644_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_ValueStringOverride(): String? {
      val fnPtr = _1606063644_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1606063644_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_ValueStringOverride(value: String?): Unit {
      val fnPtr = _1606063644_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1606063644_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun SetTitle(value: String?): AppNotificationProgressBar? {
      val fnPtr = _1606063644_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppNotificationProgressBar>()
      val hr = fn.invokeHR(arrayOf(__1606063644_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppNotificationProgressBar>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun BindTitle(): AppNotificationProgressBar? {
      val fnPtr = _1606063644_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppNotificationProgressBar>()
      val hr = fn.invokeHR(arrayOf(__1606063644_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppNotificationProgressBar>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun SetStatus(value: String?): AppNotificationProgressBar? {
      val fnPtr = _1606063644_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppNotificationProgressBar>()
      val hr = fn.invokeHR(arrayOf(__1606063644_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppNotificationProgressBar>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun BindStatus(): AppNotificationProgressBar? {
      val fnPtr = _1606063644_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppNotificationProgressBar>()
      val hr = fn.invokeHR(arrayOf(__1606063644_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppNotificationProgressBar>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun SetValue(value: Double): AppNotificationProgressBar? {
      val fnPtr = _1606063644_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppNotificationProgressBar>()
      val hr = fn.invokeHR(arrayOf(__1606063644_Ptr, value, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppNotificationProgressBar>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun BindValue(): AppNotificationProgressBar? {
      val fnPtr = _1606063644_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppNotificationProgressBar>()
      val hr = fn.invokeHR(arrayOf(__1606063644_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppNotificationProgressBar>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun SetValueStringOverride(value: String?): AppNotificationProgressBar? {
      val fnPtr = _1606063644_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppNotificationProgressBar>()
      val hr = fn.invokeHR(arrayOf(__1606063644_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppNotificationProgressBar>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun BindValueStringOverride(): AppNotificationProgressBar? {
      val fnPtr = _1606063644_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppNotificationProgressBar>()
      val hr = fn.invokeHR(arrayOf(__1606063644_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppNotificationProgressBar>(result.getValue())
      return resultValue
    }
  }

  public class IAppNotificationProgressBar_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1606063644_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppNotificationProgressBar, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fced62f220745641863087a14315ac86")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppNotificationProgressBar(ptr: Pointer?): WithDefault =
        IAppNotificationProgressBar_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppNotificationProgressBar {
      val address = segment.toRawLongValue()
      return makeIAppNotificationProgressBar(Pointer(address))
    }

    public override fun toNative(obj: IAppNotificationProgressBar): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1606063644_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppNotificationProgressBar):
        Array<IAppNotificationProgressBar?> = (elements as
        Array<IAppNotificationProgressBar?>).castToImpl<IAppNotificationProgressBar,IAppNotificationProgressBar_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppNotificationProgressBar?> =
        arrayOfNulls<IAppNotificationProgressBar_Impl>(size) as Array<IAppNotificationProgressBar?>
  }
}
