package Windows.UI.Xaml.Controls.Maps

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

@ABIMarker(IMapStyleSheetEntryStatesStatics.ABI::class)
@Signature("{23ac5532-866d-4bfa-b481-39bea1de3506}")
@Guid("23ac5532866d4bfab48139bea1de3506")
@WinRTInterface("23ac5532866d4bfab48139bea1de3506")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapStyleSheetEntryStatesStatics.ByReference::class)
public interface IMapStyleSheetEntryStatesStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Disabled(): String?

  @InterfaceMethod(1)
  public fun get_Hover(): String?

  @InterfaceMethod(2)
  public fun get_Selected(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMapStyleSheetEntryStatesStatics> {
    public override fun getValue() = ABI.makeIMapStyleSheetEntryStatesStatics(pointer.getPointer(0))

    public fun setValue(value: IMapStyleSheetEntryStatesStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapStyleSheetEntryStatesStatics {
    public val __1521027350_Ptr: Pointer?

    public val _1521027350_VtblPtr: Pointer?
      get() = __1521027350_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Disabled(): String? {
      val fnPtr = _1521027350_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1521027350_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Hover(): String? {
      val fnPtr = _1521027350_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1521027350_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Selected(): String? {
      val fnPtr = _1521027350_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1521027350_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IMapStyleSheetEntryStatesStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1521027350_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapStyleSheetEntryStatesStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("23ac5532866d4bfab48139bea1de3506")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapStyleSheetEntryStatesStatics(ptr: Pointer?): WithDefault =
        IMapStyleSheetEntryStatesStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapStyleSheetEntryStatesStatics {
      val address = segment.toRawLongValue()
      return makeIMapStyleSheetEntryStatesStatics(Pointer(address))
    }

    public override fun toNative(obj: IMapStyleSheetEntryStatesStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1521027350_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapStyleSheetEntryStatesStatics):
        Array<IMapStyleSheetEntryStatesStatics?> = (elements as
        Array<IMapStyleSheetEntryStatesStatics?>).castToImpl<IMapStyleSheetEntryStatesStatics,IMapStyleSheetEntryStatesStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapStyleSheetEntryStatesStatics?> =
        arrayOfNulls<IMapStyleSheetEntryStatesStatics_Impl>(size) as
        Array<IMapStyleSheetEntryStatesStatics?>
  }
}
