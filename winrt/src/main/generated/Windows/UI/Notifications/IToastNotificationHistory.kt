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

@ABIMarker(IToastNotificationHistory.ABI::class)
@Signature("{5caddc63-01d3-4c97-986f-0533483fee14}")
@Guid("5caddc6301d34c97986f0533483fee14")
@WinRTInterface("5caddc6301d34c97986f0533483fee14")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IToastNotificationHistory.ByReference::class)
public interface IToastNotificationHistory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun RemoveGroup(group: String?): Unit

  @InterfaceMethod(1)
  public fun RemoveGroup(group: String?, applicationId: String?): Unit

  @InterfaceMethod(2)
  public fun Remove(
    tag: String?,
    group: String?,
    applicationId: String?
  ): Unit

  @InterfaceMethod(3)
  public fun Remove(tag: String?, group: String?): Unit

  @InterfaceMethod(4)
  public fun Remove(tag: String?): Unit

  @InterfaceMethod(5)
  public fun Clear(): Unit

  @InterfaceMethod(6)
  public fun Clear(applicationId: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IToastNotificationHistory> {
    public override fun getValue() = ABI.makeIToastNotificationHistory(pointer.getPointer(0))

    public fun setValue(value: IToastNotificationHistory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IToastNotificationHistory {
    public val __1271430158_Ptr: Pointer?

    public val _1271430158_VtblPtr: Pointer?
      get() = __1271430158_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun RemoveGroup(group: String?): Unit {
      val fnPtr = _1271430158_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1271430158_Ptr, marshalToNative(group),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun RemoveGroup(group: String?, applicationId: String?): Unit {
      val fnPtr = _1271430158_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1271430158_Ptr, marshalToNative(group),
          marshalToNative(applicationId),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun Remove(
      tag: String?,
      group: String?,
      applicationId: String?
    ): Unit {
      val fnPtr = _1271430158_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1271430158_Ptr, marshalToNative(tag), marshalToNative(group),
          marshalToNative(applicationId),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun Remove(tag: String?, group: String?): Unit {
      val fnPtr = _1271430158_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1271430158_Ptr, marshalToNative(tag), marshalToNative(group),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun Remove(tag: String?): Unit {
      val fnPtr = _1271430158_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1271430158_Ptr, marshalToNative(tag),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun Clear(): Unit {
      val fnPtr = _1271430158_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1271430158_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun Clear(applicationId: String?): Unit {
      val fnPtr = _1271430158_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1271430158_Ptr, marshalToNative(applicationId),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IToastNotificationHistory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1271430158_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IToastNotificationHistory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5caddc6301d34c97986f0533483fee14")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIToastNotificationHistory(ptr: Pointer?): WithDefault =
        IToastNotificationHistory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IToastNotificationHistory {
      val address = segment.toRawLongValue()
      return makeIToastNotificationHistory(Pointer(address))
    }

    public override fun toNative(obj: IToastNotificationHistory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1271430158_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IToastNotificationHistory):
        Array<IToastNotificationHistory?> = (elements as
        Array<IToastNotificationHistory?>).castToImpl<IToastNotificationHistory,IToastNotificationHistory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IToastNotificationHistory?> =
        arrayOfNulls<IToastNotificationHistory_Impl>(size) as Array<IToastNotificationHistory?>
  }
}
