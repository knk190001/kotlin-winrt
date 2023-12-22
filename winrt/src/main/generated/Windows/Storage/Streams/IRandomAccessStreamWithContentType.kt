package Windows.Storage.Streams

import Windows.Foundation.IClosable
import Windows.Storage.Streams.IRandomAccessStream.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
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
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IRandomAccessStreamWithContentType.ABI::class)
@Signature("{cc254827-4b3d-438f-9232-10c76bc7e038}")
@Guid("cc2548274b3d438f923210c76bc7e038")
@WinRTInterface("cc2548274b3d438f923210c76bc7e038")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRandomAccessStreamWithContentType.ByReference::class)
public interface IRandomAccessStreamWithContentType : NativeMapped, IWinRTInterface,
    IRandomAccessStream, IClosable, IInputStream, IOutputStream, IContentTypeProvider {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRandomAccessStreamWithContentType> {
    public override fun getValue() =
        ABI.makeIRandomAccessStreamWithContentType(pointer.getPointer(0))

    public fun setValue(value: IRandomAccessStreamWithContentType_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRandomAccessStreamWithContentType,
      IRandomAccessStream.WithDefault, IClosable.WithDefault, IInputStream.WithDefault,
      IOutputStream.WithDefault, IContentTypeProvider.WithDefault {
    public val __380663666_Ptr: Pointer?

    public val _380663666_VtblPtr: Pointer?
      get() = __380663666_Ptr?.getPointer(0)
  }

  public class IRandomAccessStreamWithContentType_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IRandomAccessStream, IClosable,
      IInputStream, IOutputStream, IContentTypeProvider {
    public override val __597747131_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_380663666_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IClosable.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_380663666_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __736491754_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IInputStream.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_380663666_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __591248843_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IOutputStream.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_380663666_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __412040816_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IContentTypeProvider.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_380663666_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __380663666_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRandomAccessStreamWithContentType, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cc2548274b3d438f923210c76bc7e038")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRandomAccessStreamWithContentType(ptr: Pointer?): WithDefault =
        IRandomAccessStreamWithContentType_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRandomAccessStreamWithContentType {
      val address = segment.toRawLongValue()
      return makeIRandomAccessStreamWithContentType(Pointer(address))
    }

    public override fun toNative(obj: IRandomAccessStreamWithContentType): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__380663666_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRandomAccessStreamWithContentType):
        Array<IRandomAccessStreamWithContentType?> = (elements as
        Array<IRandomAccessStreamWithContentType?>).castToImpl<IRandomAccessStreamWithContentType,IRandomAccessStreamWithContentType_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRandomAccessStreamWithContentType?> =
        arrayOfNulls<IRandomAccessStreamWithContentType_Impl>(size) as
        Array<IRandomAccessStreamWithContentType?>
  }
}
