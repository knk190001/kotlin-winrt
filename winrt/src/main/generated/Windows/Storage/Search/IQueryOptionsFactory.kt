package Windows.Storage.Search

import Windows.Foundation.Collections.IIterable
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

@ABIMarker(IQueryOptionsFactory.ABI::class)
@Signature("{032e1f8c-a9c1-4e71-8011-0dee9d4811a3}")
@Guid("032e1f8ca9c14e7180110dee9d4811a3")
@WinRTInterface("032e1f8ca9c14e7180110dee9d4811a3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IQueryOptionsFactory.ByReference::class)
public interface IQueryOptionsFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateCommonFileQuery(query: CommonFileQuery?, fileTypeFilter: IIterable<String?>?):
      QueryOptions?

  @InterfaceMethod(1)
  public fun CreateCommonFolderQuery(query: CommonFolderQuery?): QueryOptions?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IQueryOptionsFactory> {
    public override fun getValue() = ABI.makeIQueryOptionsFactory(pointer.getPointer(0))

    public fun setValue(value: IQueryOptionsFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IQueryOptionsFactory {
    public val __1177423599_Ptr: Pointer?

    public val _1177423599_VtblPtr: Pointer?
      get() = __1177423599_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateCommonFileQuery(query: CommonFileQuery?,
        fileTypeFilter: IIterable<String?>?): QueryOptions? {
      val fnPtr = _1177423599_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<QueryOptions>()
      val hr = fn.invokeHR(arrayOf(__1177423599_Ptr, marshalToNative(query),
          marshalToNative(fileTypeFilter), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<QueryOptions>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateCommonFolderQuery(query: CommonFolderQuery?): QueryOptions? {
      val fnPtr = _1177423599_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<QueryOptions>()
      val hr = fn.invokeHR(arrayOf(__1177423599_Ptr, marshalToNative(query), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<QueryOptions>(result.getValue())
      return resultValue
    }
  }

  public class IQueryOptionsFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1177423599_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IQueryOptionsFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("032e1f8ca9c14e7180110dee9d4811a3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIQueryOptionsFactory(ptr: Pointer?): WithDefault = IQueryOptionsFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IQueryOptionsFactory {
      val address = segment.toRawLongValue()
      return makeIQueryOptionsFactory(Pointer(address))
    }

    public override fun toNative(obj: IQueryOptionsFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1177423599_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IQueryOptionsFactory): Array<IQueryOptionsFactory?> =
        (elements as
        Array<IQueryOptionsFactory?>).castToImpl<IQueryOptionsFactory,IQueryOptionsFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IQueryOptionsFactory?> =
        arrayOfNulls<IQueryOptionsFactory_Impl>(size) as Array<IQueryOptionsFactory?>
  }
}
