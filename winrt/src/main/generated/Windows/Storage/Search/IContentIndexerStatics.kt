package Windows.Storage.Search

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

@ABIMarker(IContentIndexerStatics.ABI::class)
@Signature("{8c488375-b37e-4c60-9ba8-b760fda3e59d}")
@Guid("8c488375b37e4c609ba8b760fda3e59d")
@WinRTInterface("8c488375b37e4c609ba8b760fda3e59d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContentIndexerStatics.ByReference::class)
public interface IContentIndexerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetIndexer(indexName: String?): ContentIndexer?

  @InterfaceMethod(1)
  public fun GetIndexer(): ContentIndexer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContentIndexerStatics> {
    public override fun getValue() = ABI.makeIContentIndexerStatics(pointer.getPointer(0))

    public fun setValue(value: IContentIndexerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContentIndexerStatics {
    public val __369827068_Ptr: Pointer?

    public val _369827068_VtblPtr: Pointer?
      get() = __369827068_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetIndexer(indexName: String?): ContentIndexer? {
      val fnPtr = _369827068_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContentIndexer>()
      val hr = fn.invokeHR(arrayOf(__369827068_Ptr, marshalToNative(indexName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContentIndexer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetIndexer(): ContentIndexer? {
      val fnPtr = _369827068_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContentIndexer>()
      val hr = fn.invokeHR(arrayOf(__369827068_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContentIndexer>(result.getValue())
      return resultValue
    }
  }

  public class IContentIndexerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __369827068_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContentIndexerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8c488375b37e4c609ba8b760fda3e59d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContentIndexerStatics(ptr: Pointer?): WithDefault =
        IContentIndexerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContentIndexerStatics {
      val address = segment.toRawLongValue()
      return makeIContentIndexerStatics(Pointer(address))
    }

    public override fun toNative(obj: IContentIndexerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__369827068_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContentIndexerStatics): Array<IContentIndexerStatics?> =
        (elements as
        Array<IContentIndexerStatics?>).castToImpl<IContentIndexerStatics,IContentIndexerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContentIndexerStatics?> =
        arrayOfNulls<IContentIndexerStatics_Impl>(size) as Array<IContentIndexerStatics?>
  }
}
