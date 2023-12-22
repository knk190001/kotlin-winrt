package Windows.UI.Core

import Windows.UI.Core.ICoreWindowEventArgs.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IAutomationProviderRequestedEventArgs.ABI::class)
@Signature("{961ff258-21bf-4b42-a298-fa479d4c52e2}")
@Guid("961ff25821bf4b42a298fa479d4c52e2")
@WinRTInterface("961ff25821bf4b42a298fa479d4c52e2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAutomationProviderRequestedEventArgs.ByReference::class)
public interface IAutomationProviderRequestedEventArgs : NativeMapped, IWinRTInterface,
    ICoreWindowEventArgs {
  @InterfaceMethod(0)
  public fun get_AutomationProvider(): IUnknown?

  @InterfaceMethod(1)
  public fun put_AutomationProvider(value: IUnknown?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAutomationProviderRequestedEventArgs> {
    public override fun getValue() =
        ABI.makeIAutomationProviderRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IAutomationProviderRequestedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAutomationProviderRequestedEventArgs,
      ICoreWindowEventArgs.WithDefault {
    public val __38662292_Ptr: Pointer?

    public val _38662292_VtblPtr: Pointer?
      get() = __38662292_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AutomationProvider(): IUnknown? {
      val fnPtr = _38662292_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__38662292_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_AutomationProvider(value: IUnknown?): Unit {
      val fnPtr = _38662292_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__38662292_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAutomationProviderRequestedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, ICoreWindowEventArgs {
    public override val __407060269_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_38662292_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __38662292_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAutomationProviderRequestedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("961ff25821bf4b42a298fa479d4c52e2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAutomationProviderRequestedEventArgs(ptr: Pointer?): WithDefault =
        IAutomationProviderRequestedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAutomationProviderRequestedEventArgs {
      val address = segment.toRawLongValue()
      return makeIAutomationProviderRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IAutomationProviderRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__38662292_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAutomationProviderRequestedEventArgs):
        Array<IAutomationProviderRequestedEventArgs?> = (elements as
        Array<IAutomationProviderRequestedEventArgs?>).castToImpl<IAutomationProviderRequestedEventArgs,IAutomationProviderRequestedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAutomationProviderRequestedEventArgs?> =
        arrayOfNulls<IAutomationProviderRequestedEventArgs_Impl>(size) as
        Array<IAutomationProviderRequestedEventArgs?>
  }
}
