package Windows.ApplicationModel.Background

import Windows.ApplicationModel.Background.IBackgroundTrigger.ABI.IID
import Windows.Foundation.TimeSpan
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IContentPrefetchTrigger.ABI::class)
@Signature("{710627ee-04fa-440b-80c0-173202199e5d}")
@Guid("710627ee04fa440b80c0173202199e5d")
@WinRTInterface("710627ee04fa440b80c0173202199e5d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContentPrefetchTrigger.ByReference::class)
public interface IContentPrefetchTrigger : NativeMapped, IWinRTInterface, IBackgroundTrigger {
  @InterfaceMethod(0)
  public fun get_WaitInterval(): TimeSpan?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContentPrefetchTrigger> {
    public override fun getValue() = ABI.makeIContentPrefetchTrigger(pointer.getPointer(0))

    public fun setValue(value: IContentPrefetchTrigger_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContentPrefetchTrigger, IBackgroundTrigger.WithDefault {
    public val __1792853305_Ptr: Pointer?

    public val _1792853305_VtblPtr: Pointer?
      get() = __1792853305_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_WaitInterval(): TimeSpan? {
      val fnPtr = _1792853305_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1792853305_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }
  }

  public class IContentPrefetchTrigger_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IBackgroundTrigger {
    public override val __54213927_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1792853305_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1792853305_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContentPrefetchTrigger, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("710627ee04fa440b80c0173202199e5d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContentPrefetchTrigger(ptr: Pointer?): WithDefault =
        IContentPrefetchTrigger_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContentPrefetchTrigger {
      val address = segment.toRawLongValue()
      return makeIContentPrefetchTrigger(Pointer(address))
    }

    public override fun toNative(obj: IContentPrefetchTrigger): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1792853305_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContentPrefetchTrigger): Array<IContentPrefetchTrigger?>
        = (elements as
        Array<IContentPrefetchTrigger?>).castToImpl<IContentPrefetchTrigger,IContentPrefetchTrigger_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContentPrefetchTrigger?> =
        arrayOfNulls<IContentPrefetchTrigger_Impl>(size) as Array<IContentPrefetchTrigger?>
  }
}
