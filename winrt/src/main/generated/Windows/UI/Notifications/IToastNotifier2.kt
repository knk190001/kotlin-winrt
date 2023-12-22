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

@ABIMarker(IToastNotifier2.ABI::class)
@Signature("{354389c6-7c01-4bd5-9c20-604340cd2b74}")
@Guid("354389c67c014bd59c20604340cd2b74")
@WinRTInterface("354389c67c014bd59c20604340cd2b74")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IToastNotifier2.ByReference::class)
public interface IToastNotifier2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Update(
    `data`: NotificationData?,
    tag: String?,
    group: String?
  ): NotificationUpdateResult?

  @InterfaceMethod(1)
  public fun Update(`data`: NotificationData?, tag: String?): NotificationUpdateResult?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IToastNotifier2> {
    public override fun getValue() = ABI.makeIToastNotifier2(pointer.getPointer(0))

    public fun setValue(value: IToastNotifier2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IToastNotifier2 {
    public val __1472196267_Ptr: Pointer?

    public val _1472196267_VtblPtr: Pointer?
      get() = __1472196267_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Update(
      `data`: NotificationData?,
      tag: String?,
      group: String?
    ): NotificationUpdateResult? {
      val fnPtr = _1472196267_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NotificationUpdateResult>()
      val hr = fn.invokeHR(arrayOf(__1472196267_Ptr, marshalToNative(data), marshalToNative(tag),
          marshalToNative(group), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NotificationUpdateResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun Update(`data`: NotificationData?, tag: String?): NotificationUpdateResult? {
      val fnPtr = _1472196267_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NotificationUpdateResult>()
      val hr = fn.invokeHR(arrayOf(__1472196267_Ptr, marshalToNative(data), marshalToNative(tag),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NotificationUpdateResult>(result.getValue())
      return resultValue
    }
  }

  public class IToastNotifier2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1472196267_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IToastNotifier2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("354389c67c014bd59c20604340cd2b74")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIToastNotifier2(ptr: Pointer?): WithDefault = IToastNotifier2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IToastNotifier2 {
      val address = segment.toRawLongValue()
      return makeIToastNotifier2(Pointer(address))
    }

    public override fun toNative(obj: IToastNotifier2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1472196267_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IToastNotifier2): Array<IToastNotifier2?> = (elements as
        Array<IToastNotifier2?>).castToImpl<IToastNotifier2,IToastNotifier2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IToastNotifier2?> =
        arrayOfNulls<IToastNotifier2_Impl>(size) as Array<IToastNotifier2?>
  }
}
