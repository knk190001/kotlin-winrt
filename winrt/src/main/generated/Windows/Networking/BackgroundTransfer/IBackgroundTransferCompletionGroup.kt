package Windows.Networking.BackgroundTransfer

import Windows.ApplicationModel.Background.IBackgroundTrigger
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IBackgroundTransferCompletionGroup.ABI::class)
@Signature("{2d930225-986b-574d-7950-0add47f5d706}")
@Guid("2d930225986b574d79500add47f5d706")
@WinRTInterface("2d930225986b574d79500add47f5d706")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBackgroundTransferCompletionGroup.ByReference::class)
public interface IBackgroundTransferCompletionGroup : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Trigger(): IBackgroundTrigger?

  @InterfaceMethod(1)
  public fun get_IsEnabled(): Boolean

  @InterfaceMethod(2)
  public fun Enable(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBackgroundTransferCompletionGroup> {
    public override fun getValue() =
        ABI.makeIBackgroundTransferCompletionGroup(pointer.getPointer(0))

    public fun setValue(value: IBackgroundTransferCompletionGroup_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBackgroundTransferCompletionGroup {
    public val __307218327_Ptr: Pointer?

    public val _307218327_VtblPtr: Pointer?
      get() = __307218327_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Trigger(): IBackgroundTrigger? {
      val fnPtr = _307218327_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBackgroundTrigger>()
      val hr = fn.invokeHR(arrayOf(__307218327_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBackgroundTrigger>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IsEnabled(): Boolean {
      val fnPtr = _307218327_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__307218327_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun Enable(): Unit {
      val fnPtr = _307218327_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__307218327_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IBackgroundTransferCompletionGroup_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __307218327_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBackgroundTransferCompletionGroup, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2d930225986b574d79500add47f5d706")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBackgroundTransferCompletionGroup(ptr: Pointer?): WithDefault =
        IBackgroundTransferCompletionGroup_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBackgroundTransferCompletionGroup {
      val address = segment.toRawLongValue()
      return makeIBackgroundTransferCompletionGroup(Pointer(address))
    }

    public override fun toNative(obj: IBackgroundTransferCompletionGroup): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__307218327_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBackgroundTransferCompletionGroup):
        Array<IBackgroundTransferCompletionGroup?> = (elements as
        Array<IBackgroundTransferCompletionGroup?>).castToImpl<IBackgroundTransferCompletionGroup,IBackgroundTransferCompletionGroup_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBackgroundTransferCompletionGroup?> =
        arrayOfNulls<IBackgroundTransferCompletionGroup_Impl>(size) as
        Array<IBackgroundTransferCompletionGroup?>
  }
}
