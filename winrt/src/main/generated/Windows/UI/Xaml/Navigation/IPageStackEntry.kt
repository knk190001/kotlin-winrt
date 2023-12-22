package Windows.UI.Xaml.Navigation

import Windows.UI.Xaml.Interop.TypeName
import Windows.UI.Xaml.Media.Animation.NavigationTransitionInfo
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IPageStackEntry.ABI::class)
@Signature("{ef8814a6-9388-4aca-8572-405194069080}")
@Guid("ef8814a693884aca8572405194069080")
@WinRTInterface("ef8814a693884aca8572405194069080")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPageStackEntry.ByReference::class)
public interface IPageStackEntry : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SourcePageType(): TypeName?

  @InterfaceMethod(1)
  public fun get_Parameter(): IUnknown?

  @InterfaceMethod(2)
  public fun get_NavigationTransitionInfo(): NavigationTransitionInfo?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPageStackEntry> {
    public override fun getValue() = ABI.makeIPageStackEntry(pointer.getPointer(0))

    public fun setValue(value: IPageStackEntry_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPageStackEntry {
    public val __574345_Ptr: Pointer?

    public val _574345_VtblPtr: Pointer?
      get() = __574345_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SourcePageType(): TypeName? {
      val fnPtr = _574345_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TypeName>()
      val hr = fn.invokeHR(arrayOf(__574345_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TypeName>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Parameter(): IUnknown? {
      val fnPtr = _574345_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__574345_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_NavigationTransitionInfo(): NavigationTransitionInfo? {
      val fnPtr = _574345_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NavigationTransitionInfo>()
      val hr = fn.invokeHR(arrayOf(__574345_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NavigationTransitionInfo>(result.getValue())
      return resultValue
    }
  }

  public class IPageStackEntry_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __574345_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPageStackEntry, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ef8814a693884aca8572405194069080")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPageStackEntry(ptr: Pointer?): WithDefault = IPageStackEntry_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPageStackEntry {
      val address = segment.toRawLongValue()
      return makeIPageStackEntry(Pointer(address))
    }

    public override fun toNative(obj: IPageStackEntry): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__574345_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPageStackEntry): Array<IPageStackEntry?> = (elements as
        Array<IPageStackEntry?>).castToImpl<IPageStackEntry,IPageStackEntry_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPageStackEntry?> =
        arrayOfNulls<IPageStackEntry_Impl>(size) as Array<IPageStackEntry?>
  }
}
