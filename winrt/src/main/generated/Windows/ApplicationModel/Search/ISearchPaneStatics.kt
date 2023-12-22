package Windows.ApplicationModel.Search

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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISearchPaneStatics.ABI::class)
@Signature("{9572adf1-8f1d-481f-a15b-c61655f16a0e}")
@Guid("9572adf18f1d481fa15bc61655f16a0e")
@WinRTInterface("9572adf18f1d481fa15bc61655f16a0e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISearchPaneStatics.ByReference::class)
public interface ISearchPaneStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetForCurrentView(): SearchPane?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISearchPaneStatics> {
    public override fun getValue() = ABI.makeISearchPaneStatics(pointer.getPointer(0))

    public fun setValue(value: ISearchPaneStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISearchPaneStatics {
    public val __2023387746_Ptr: Pointer?

    public val _2023387746_VtblPtr: Pointer?
      get() = __2023387746_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetForCurrentView(): SearchPane? {
      val fnPtr = _2023387746_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SearchPane>()
      val hr = fn.invokeHR(arrayOf(__2023387746_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SearchPane>(result.getValue())
      return resultValue
    }
  }

  public class ISearchPaneStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2023387746_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISearchPaneStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9572adf18f1d481fa15bc61655f16a0e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISearchPaneStatics(ptr: Pointer?): WithDefault = ISearchPaneStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISearchPaneStatics {
      val address = segment.toRawLongValue()
      return makeISearchPaneStatics(Pointer(address))
    }

    public override fun toNative(obj: ISearchPaneStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2023387746_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISearchPaneStatics): Array<ISearchPaneStatics?> =
        (elements as
        Array<ISearchPaneStatics?>).castToImpl<ISearchPaneStatics,ISearchPaneStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISearchPaneStatics?> =
        arrayOfNulls<ISearchPaneStatics_Impl>(size) as Array<ISearchPaneStatics?>
  }
}
