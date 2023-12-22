package Windows.Web.AtomPub

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.Uri
import Windows.Web.Syndication.ISyndicationNode
import Windows.Web.Syndication.ISyndicationNode.ABI.IID
import Windows.Web.Syndication.ISyndicationText
import Windows.Web.Syndication.SyndicationCategory
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IResourceCollection.ABI::class)
@Signature("{7f5fd609-bc88-41d4-88fa-3de6704d428e}")
@Guid("7f5fd609bc8841d488fa3de6704d428e")
@WinRTInterface("7f5fd609bc8841d488fa3de6704d428e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IResourceCollection.ByReference::class)
public interface IResourceCollection : NativeMapped, IWinRTInterface, ISyndicationNode {
  @InterfaceMethod(0)
  public fun get_Title(): ISyndicationText?

  @InterfaceMethod(1)
  public fun get_Uri(): Uri?

  @InterfaceMethod(2)
  public fun get_Categories(): IVectorView<SyndicationCategory?>?

  @InterfaceMethod(3)
  public fun get_Accepts(): IVectorView<String?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IResourceCollection> {
    public override fun getValue() = ABI.makeIResourceCollection(pointer.getPointer(0))

    public fun setValue(value: IResourceCollection_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IResourceCollection, ISyndicationNode.WithDefault {
    public val __649921010_Ptr: Pointer?

    public val _649921010_VtblPtr: Pointer?
      get() = __649921010_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Title(): ISyndicationText? {
      val fnPtr = _649921010_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ISyndicationText>()
      val hr = fn.invokeHR(arrayOf(__649921010_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ISyndicationText>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Uri(): Uri? {
      val fnPtr = _649921010_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__649921010_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Categories(): IVectorView<SyndicationCategory?>? {
      val fnPtr = _649921010_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<SyndicationCategory?>>()
      val hr = fn.invokeHR(arrayOf(__649921010_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<SyndicationCategory?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Accepts(): IVectorView<String?>? {
      val fnPtr = _649921010_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<String?>>()
      val hr = fn.invokeHR(arrayOf(__649921010_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<String?>>(result.getValue())
      return resultValue
    }
  }

  public class IResourceCollection_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, ISyndicationNode {
    public override val __1576492622_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_649921010_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __649921010_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IResourceCollection, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7f5fd609bc8841d488fa3de6704d428e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIResourceCollection(ptr: Pointer?): WithDefault = IResourceCollection_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IResourceCollection {
      val address = segment.toRawLongValue()
      return makeIResourceCollection(Pointer(address))
    }

    public override fun toNative(obj: IResourceCollection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__649921010_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IResourceCollection): Array<IResourceCollection?> =
        (elements as
        Array<IResourceCollection?>).castToImpl<IResourceCollection,IResourceCollection_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IResourceCollection?> =
        arrayOfNulls<IResourceCollection_Impl>(size) as Array<IResourceCollection?>
  }
}
