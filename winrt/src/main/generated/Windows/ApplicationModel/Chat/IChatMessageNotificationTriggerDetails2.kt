package Windows.ApplicationModel.Chat

import Windows.ApplicationModel.Chat.IChatMessageNotificationTriggerDetails.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IChatMessageNotificationTriggerDetails2.ABI::class)
@Signature("{6bb522e0-aa07-4fd1-9471-77934fb75ee6}")
@Guid("6bb522e0aa074fd1947177934fb75ee6")
@WinRTInterface("6bb522e0aa074fd1947177934fb75ee6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IChatMessageNotificationTriggerDetails2.ByReference::class)
public interface IChatMessageNotificationTriggerDetails2 : NativeMapped, IWinRTInterface,
    IChatMessageNotificationTriggerDetails {
  @InterfaceMethod(0)
  public fun get_ShouldDisplayToast(): Boolean

  @InterfaceMethod(1)
  public fun get_ShouldUpdateDetailText(): Boolean

  @InterfaceMethod(2)
  public fun get_ShouldUpdateBadge(): Boolean

  @InterfaceMethod(3)
  public fun get_ShouldUpdateActionCenter(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IChatMessageNotificationTriggerDetails2> {
    public override fun getValue() =
        ABI.makeIChatMessageNotificationTriggerDetails2(pointer.getPointer(0))

    public fun setValue(value: IChatMessageNotificationTriggerDetails2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IChatMessageNotificationTriggerDetails2,
      IChatMessageNotificationTriggerDetails.WithDefault {
    public val __606628053_Ptr: Pointer?

    public val _606628053_VtblPtr: Pointer?
      get() = __606628053_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ShouldDisplayToast(): Boolean {
      val fnPtr = _606628053_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__606628053_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_ShouldUpdateDetailText(): Boolean {
      val fnPtr = _606628053_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__606628053_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_ShouldUpdateBadge(): Boolean {
      val fnPtr = _606628053_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__606628053_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_ShouldUpdateActionCenter(): Boolean {
      val fnPtr = _606628053_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__606628053_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IChatMessageNotificationTriggerDetails2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface,
      IChatMessageNotificationTriggerDetails {
    public override val __257526019_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_606628053_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __606628053_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IChatMessageNotificationTriggerDetails2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6bb522e0aa074fd1947177934fb75ee6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIChatMessageNotificationTriggerDetails2(ptr: Pointer?): WithDefault =
        IChatMessageNotificationTriggerDetails2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IChatMessageNotificationTriggerDetails2 {
      val address = segment.toRawLongValue()
      return makeIChatMessageNotificationTriggerDetails2(Pointer(address))
    }

    public override fun toNative(obj: IChatMessageNotificationTriggerDetails2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__606628053_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IChatMessageNotificationTriggerDetails2):
        Array<IChatMessageNotificationTriggerDetails2?> = (elements as
        Array<IChatMessageNotificationTriggerDetails2?>).castToImpl<IChatMessageNotificationTriggerDetails2,IChatMessageNotificationTriggerDetails2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IChatMessageNotificationTriggerDetails2?> =
        arrayOfNulls<IChatMessageNotificationTriggerDetails2_Impl>(size) as
        Array<IChatMessageNotificationTriggerDetails2?>
  }
}
