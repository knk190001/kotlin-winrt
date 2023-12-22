package Windows.UI.Xaml.Automation.Provider

import Windows.UI.Xaml.Automation.Provider.ITextRangeProvider.ABI.IID
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

@ABIMarker(ITextRangeProvider2.ABI::class)
@Signature("{d3be3dfb-9f54-4642-a7a5-5c18d5ee2a3f}")
@Guid("d3be3dfb9f544642a7a55c18d5ee2a3f")
@WinRTInterface("d3be3dfb9f544642a7a55c18d5ee2a3f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITextRangeProvider2.ByReference::class)
public interface ITextRangeProvider2 : NativeMapped, IWinRTInterface, ITextRangeProvider {
  @InterfaceMethod(0)
  public fun ShowContextMenu(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITextRangeProvider2> {
    public override fun getValue() = ABI.makeITextRangeProvider2(pointer.getPointer(0))

    public fun setValue(value: ITextRangeProvider2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITextRangeProvider2, ITextRangeProvider.WithDefault {
    public val __985052489_Ptr: Pointer?

    public val _985052489_VtblPtr: Pointer?
      get() = __985052489_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ShowContextMenu(): Unit {
      val fnPtr = _985052489_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__985052489_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ITextRangeProvider2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, ITextRangeProvider {
    public override val __106771447_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_985052489_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __985052489_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITextRangeProvider2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d3be3dfb9f544642a7a55c18d5ee2a3f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITextRangeProvider2(ptr: Pointer?): WithDefault = ITextRangeProvider2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITextRangeProvider2 {
      val address = segment.toRawLongValue()
      return makeITextRangeProvider2(Pointer(address))
    }

    public override fun toNative(obj: ITextRangeProvider2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__985052489_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITextRangeProvider2): Array<ITextRangeProvider2?> =
        (elements as
        Array<ITextRangeProvider2?>).castToImpl<ITextRangeProvider2,ITextRangeProvider2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITextRangeProvider2?> =
        arrayOfNulls<ITextRangeProvider2_Impl>(size) as Array<ITextRangeProvider2?>
  }
}
