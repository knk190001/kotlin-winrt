package Windows.UI.Notifications

import Windows.Foundation.Collections.IMap
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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(INotificationData.ABI::class)
@Signature("{9ffd2312-9d6a-4aaf-b6ac-ff17f0c1f280}")
@Guid("9ffd23129d6a4aafb6acff17f0c1f280")
@WinRTInterface("9ffd23129d6a4aafb6acff17f0c1f280")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INotificationData.ByReference::class)
public interface INotificationData : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Values(): IMap<String?, String?>?

  @InterfaceMethod(1)
  public fun get_SequenceNumber(): WinDef.UINT

  @InterfaceMethod(2)
  public fun put_SequenceNumber(value: WinDef.UINT): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INotificationData> {
    public override fun getValue() = ABI.makeINotificationData(pointer.getPointer(0))

    public fun setValue(value: INotificationData_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INotificationData {
    public val __1252576347_Ptr: Pointer?

    public val _1252576347_VtblPtr: Pointer?
      get() = __1252576347_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Values(): IMap<String?, String?>? {
      val fnPtr = _1252576347_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMap<String?, String?>>()
      val hr = fn.invokeHR(arrayOf(__1252576347_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMap<String?, String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_SequenceNumber(): WinDef.UINT {
      val fnPtr = _1252576347_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1252576347_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun put_SequenceNumber(value: WinDef.UINT): Unit {
      val fnPtr = _1252576347_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1252576347_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class INotificationData_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1252576347_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INotificationData, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9ffd23129d6a4aafb6acff17f0c1f280")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINotificationData(ptr: Pointer?): WithDefault = INotificationData_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INotificationData {
      val address = segment.toRawLongValue()
      return makeINotificationData(Pointer(address))
    }

    public override fun toNative(obj: INotificationData): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1252576347_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INotificationData): Array<INotificationData?> = (elements
        as Array<INotificationData?>).castToImpl<INotificationData,INotificationData_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INotificationData?> =
        arrayOfNulls<INotificationData_Impl>(size) as Array<INotificationData?>
  }
}
