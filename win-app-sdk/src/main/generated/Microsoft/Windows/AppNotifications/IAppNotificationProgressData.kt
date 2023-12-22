package Microsoft.Windows.AppNotifications

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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IAppNotificationProgressData.ABI::class)
@Signature("{4debfac0-809d-55cb-b879-924821876b97}")
@Guid("4debfac0809d55cbb879924821876b97")
@WinRTInterface("4debfac0809d55cbb879924821876b97")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppNotificationProgressData.ByReference::class)
public interface IAppNotificationProgressData : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SequenceNumber(): WinDef.UINT

  @InterfaceMethod(1)
  public fun put_SequenceNumber(value: WinDef.UINT): Unit

  @InterfaceMethod(2)
  public fun get_Title(): String?

  @InterfaceMethod(3)
  public fun put_Title(value: String?): Unit

  @InterfaceMethod(4)
  public fun get_Value(): Double

  @InterfaceMethod(5)
  public fun put_Value(value: Double): Unit

  @InterfaceMethod(6)
  public fun get_ValueStringOverride(): String?

  @InterfaceMethod(7)
  public fun put_ValueStringOverride(value: String?): Unit

  @InterfaceMethod(8)
  public fun get_Status(): String?

  @InterfaceMethod(9)
  public fun put_Status(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppNotificationProgressData> {
    public override fun getValue() = ABI.makeIAppNotificationProgressData(pointer.getPointer(0))

    public fun setValue(value: IAppNotificationProgressData_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppNotificationProgressData {
    public val __2024446956_Ptr: Pointer?

    public val _2024446956_VtblPtr: Pointer?
      get() = __2024446956_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SequenceNumber(): WinDef.UINT {
      val fnPtr = _2024446956_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__2024446956_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_SequenceNumber(value: WinDef.UINT): Unit {
      val fnPtr = _2024446956_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2024446956_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Title(): String? {
      val fnPtr = _2024446956_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2024446956_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Title(value: String?): Unit {
      val fnPtr = _2024446956_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2024446956_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Value(): Double {
      val fnPtr = _2024446956_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__2024446956_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_Value(value: Double): Unit {
      val fnPtr = _2024446956_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2024446956_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_ValueStringOverride(): String? {
      val fnPtr = _2024446956_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2024446956_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_ValueStringOverride(value: String?): Unit {
      val fnPtr = _2024446956_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2024446956_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_Status(): String? {
      val fnPtr = _2024446956_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2024446956_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_Status(value: String?): Unit {
      val fnPtr = _2024446956_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2024446956_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAppNotificationProgressData_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2024446956_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppNotificationProgressData, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4debfac0809d55cbb879924821876b97")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppNotificationProgressData(ptr: Pointer?): WithDefault =
        IAppNotificationProgressData_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppNotificationProgressData {
      val address = segment.toRawLongValue()
      return makeIAppNotificationProgressData(Pointer(address))
    }

    public override fun toNative(obj: IAppNotificationProgressData): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2024446956_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppNotificationProgressData):
        Array<IAppNotificationProgressData?> = (elements as
        Array<IAppNotificationProgressData?>).castToImpl<IAppNotificationProgressData,IAppNotificationProgressData_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppNotificationProgressData?> =
        arrayOfNulls<IAppNotificationProgressData_Impl>(size) as
        Array<IAppNotificationProgressData?>
  }
}
