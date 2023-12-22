package Windows.UI.Xaml.Controls

import Windows.ApplicationModel.Search.SearchQueryLinguisticDetails
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

@ABIMarker(ISearchBoxQueryChangedEventArgs.ABI::class)
@Signature("{a9a70f8f-0cb0-4bd2-9998-2fb57ad5e731}")
@Guid("a9a70f8f0cb04bd299982fb57ad5e731")
@WinRTInterface("a9a70f8f0cb04bd299982fb57ad5e731")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISearchBoxQueryChangedEventArgs.ByReference::class)
public interface ISearchBoxQueryChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_QueryText(): String?

  @InterfaceMethod(1)
  public fun get_Language(): String?

  @InterfaceMethod(2)
  public fun get_LinguisticDetails(): SearchQueryLinguisticDetails?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISearchBoxQueryChangedEventArgs> {
    public override fun getValue() = ABI.makeISearchBoxQueryChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ISearchBoxQueryChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISearchBoxQueryChangedEventArgs {
    public val __775582468_Ptr: Pointer?

    public val _775582468_VtblPtr: Pointer?
      get() = __775582468_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_QueryText(): String? {
      val fnPtr = _775582468_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__775582468_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Language(): String? {
      val fnPtr = _775582468_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__775582468_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_LinguisticDetails(): SearchQueryLinguisticDetails? {
      val fnPtr = _775582468_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SearchQueryLinguisticDetails>()
      val hr = fn.invokeHR(arrayOf(__775582468_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SearchQueryLinguisticDetails>(result.getValue())
      return resultValue
    }
  }

  public class ISearchBoxQueryChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __775582468_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISearchBoxQueryChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a9a70f8f0cb04bd299982fb57ad5e731")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISearchBoxQueryChangedEventArgs(ptr: Pointer?): WithDefault =
        ISearchBoxQueryChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISearchBoxQueryChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeISearchBoxQueryChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ISearchBoxQueryChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__775582468_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISearchBoxQueryChangedEventArgs):
        Array<ISearchBoxQueryChangedEventArgs?> = (elements as
        Array<ISearchBoxQueryChangedEventArgs?>).castToImpl<ISearchBoxQueryChangedEventArgs,ISearchBoxQueryChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISearchBoxQueryChangedEventArgs?> =
        arrayOfNulls<ISearchBoxQueryChangedEventArgs_Impl>(size) as
        Array<ISearchBoxQueryChangedEventArgs?>
  }
}
