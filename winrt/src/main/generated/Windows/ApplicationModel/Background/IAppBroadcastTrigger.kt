package Windows.ApplicationModel.Background

import Windows.ApplicationModel.Background.IBackgroundTrigger.ABI.IID
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

@ABIMarker(IAppBroadcastTrigger.ABI::class)
@Signature("{74d4f496-8d37-44ec-9481-2a0b9854eb48}")
@Guid("74d4f4968d3744ec94812a0b9854eb48")
@WinRTInterface("74d4f4968d3744ec94812a0b9854eb48")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppBroadcastTrigger.ByReference::class)
public interface IAppBroadcastTrigger : NativeMapped, IWinRTInterface, IBackgroundTrigger {
  @InterfaceMethod(0)
  public fun put_ProviderInfo(value: AppBroadcastTriggerProviderInfo?): Unit

  @InterfaceMethod(1)
  public fun get_ProviderInfo(): AppBroadcastTriggerProviderInfo?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppBroadcastTrigger> {
    public override fun getValue() = ABI.makeIAppBroadcastTrigger(pointer.getPointer(0))

    public fun setValue(value: IAppBroadcastTrigger_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppBroadcastTrigger, IBackgroundTrigger.WithDefault {
    public val __1946034279_Ptr: Pointer?

    public val _1946034279_VtblPtr: Pointer?
      get() = __1946034279_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_ProviderInfo(value: AppBroadcastTriggerProviderInfo?): Unit {
      val fnPtr = _1946034279_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1946034279_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_ProviderInfo(): AppBroadcastTriggerProviderInfo? {
      val fnPtr = _1946034279_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppBroadcastTriggerProviderInfo>()
      val hr = fn.invokeHR(arrayOf(__1946034279_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppBroadcastTriggerProviderInfo>(result.getValue())
      return resultValue
    }
  }

  public class IAppBroadcastTrigger_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IBackgroundTrigger {
    public override val __54213927_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1946034279_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1946034279_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppBroadcastTrigger, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("74d4f4968d3744ec94812a0b9854eb48")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppBroadcastTrigger(ptr: Pointer?): WithDefault = IAppBroadcastTrigger_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppBroadcastTrigger {
      val address = segment.toRawLongValue()
      return makeIAppBroadcastTrigger(Pointer(address))
    }

    public override fun toNative(obj: IAppBroadcastTrigger): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1946034279_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppBroadcastTrigger): Array<IAppBroadcastTrigger?> =
        (elements as
        Array<IAppBroadcastTrigger?>).castToImpl<IAppBroadcastTrigger,IAppBroadcastTrigger_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppBroadcastTrigger?> =
        arrayOfNulls<IAppBroadcastTrigger_Impl>(size) as Array<IAppBroadcastTrigger?>
  }
}
