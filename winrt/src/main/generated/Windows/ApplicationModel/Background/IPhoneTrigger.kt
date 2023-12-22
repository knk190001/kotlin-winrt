package Windows.ApplicationModel.Background

import Windows.ApplicationModel.Background.IBackgroundTrigger.ABI.IID
import Windows.ApplicationModel.Calls.Background.PhoneTriggerType
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

@ABIMarker(IPhoneTrigger.ABI::class)
@Signature("{8dcfe99b-d4c5-49f1-b7d3-82e87a0e9dde}")
@Guid("8dcfe99bd4c549f1b7d382e87a0e9dde")
@WinRTInterface("8dcfe99bd4c549f1b7d382e87a0e9dde")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPhoneTrigger.ByReference::class)
public interface IPhoneTrigger : NativeMapped, IWinRTInterface, IBackgroundTrigger {
  @InterfaceMethod(0)
  public fun get_OneShot(): Boolean

  @InterfaceMethod(1)
  public fun get_TriggerType(): PhoneTriggerType?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPhoneTrigger>
      {
    public override fun getValue() = ABI.makeIPhoneTrigger(pointer.getPointer(0))

    public fun setValue(value: IPhoneTrigger_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPhoneTrigger, IBackgroundTrigger.WithDefault {
    public val __90225883_Ptr: Pointer?

    public val _90225883_VtblPtr: Pointer?
      get() = __90225883_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_OneShot(): Boolean {
      val fnPtr = _90225883_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__90225883_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_TriggerType(): PhoneTriggerType? {
      val fnPtr = _90225883_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PhoneTriggerType>()
      val hr = fn.invokeHR(arrayOf(__90225883_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PhoneTriggerType>(result.getValue())
      return resultValue
    }
  }

  public class IPhoneTrigger_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IBackgroundTrigger {
    public override val __54213927_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_90225883_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __90225883_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPhoneTrigger, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8dcfe99bd4c549f1b7d382e87a0e9dde")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPhoneTrigger(ptr: Pointer?): WithDefault = IPhoneTrigger_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPhoneTrigger {
      val address = segment.toRawLongValue()
      return makeIPhoneTrigger(Pointer(address))
    }

    public override fun toNative(obj: IPhoneTrigger): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__90225883_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPhoneTrigger): Array<IPhoneTrigger?> = (elements as
        Array<IPhoneTrigger?>).castToImpl<IPhoneTrigger,IPhoneTrigger_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPhoneTrigger?> =
        arrayOfNulls<IPhoneTrigger_Impl>(size) as Array<IPhoneTrigger?>
  }
}
