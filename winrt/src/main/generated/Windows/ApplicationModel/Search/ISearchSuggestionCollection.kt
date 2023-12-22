package Windows.ApplicationModel.Search

import Windows.Foundation.Collections.IIterable
import Windows.Storage.Streams.IRandomAccessStreamReference
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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(ISearchSuggestionCollection.ABI::class)
@Signature("{323a8a4b-fbea-4446-abbc-3da7915fdd3a}")
@Guid("323a8a4bfbea4446abbc3da7915fdd3a")
@WinRTInterface("323a8a4bfbea4446abbc3da7915fdd3a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISearchSuggestionCollection.ByReference::class)
public interface ISearchSuggestionCollection : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Size(): WinDef.UINT

  @InterfaceMethod(1)
  public fun AppendQuerySuggestion(text: String?): Unit

  @InterfaceMethod(2)
  public fun AppendQuerySuggestions(suggestions: IIterable<String?>?): Unit

  @InterfaceMethod(3)
  public fun AppendResultSuggestion(
    text: String?,
    detailText: String?,
    tag: String?,
    image: IRandomAccessStreamReference?,
    imageAlternateText: String?
  ): Unit

  @InterfaceMethod(4)
  public fun AppendSearchSeparator(label: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISearchSuggestionCollection> {
    public override fun getValue() = ABI.makeISearchSuggestionCollection(pointer.getPointer(0))

    public fun setValue(value: ISearchSuggestionCollection_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISearchSuggestionCollection {
    public val __682278529_Ptr: Pointer?

    public val _682278529_VtblPtr: Pointer?
      get() = __682278529_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Size(): WinDef.UINT {
      val fnPtr = _682278529_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__682278529_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun AppendQuerySuggestion(text: String?): Unit {
      val fnPtr = _682278529_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__682278529_Ptr, marshalToNative(text),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun AppendQuerySuggestions(suggestions: IIterable<String?>?): Unit {
      val fnPtr = _682278529_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__682278529_Ptr, marshalToNative(suggestions),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun AppendResultSuggestion(
      text: String?,
      detailText: String?,
      tag: String?,
      image: IRandomAccessStreamReference?,
      imageAlternateText: String?
    ): Unit {
      val fnPtr = _682278529_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__682278529_Ptr, marshalToNative(text),
          marshalToNative(detailText), marshalToNative(tag), marshalToNative(image),
          marshalToNative(imageAlternateText),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun AppendSearchSeparator(label: String?): Unit {
      val fnPtr = _682278529_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__682278529_Ptr, marshalToNative(label),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISearchSuggestionCollection_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __682278529_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISearchSuggestionCollection, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("323a8a4bfbea4446abbc3da7915fdd3a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISearchSuggestionCollection(ptr: Pointer?): WithDefault =
        ISearchSuggestionCollection_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISearchSuggestionCollection {
      val address = segment.toRawLongValue()
      return makeISearchSuggestionCollection(Pointer(address))
    }

    public override fun toNative(obj: ISearchSuggestionCollection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__682278529_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISearchSuggestionCollection):
        Array<ISearchSuggestionCollection?> = (elements as
        Array<ISearchSuggestionCollection?>).castToImpl<ISearchSuggestionCollection,ISearchSuggestionCollection_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISearchSuggestionCollection?> =
        arrayOfNulls<ISearchSuggestionCollection_Impl>(size) as Array<ISearchSuggestionCollection?>
  }
}
