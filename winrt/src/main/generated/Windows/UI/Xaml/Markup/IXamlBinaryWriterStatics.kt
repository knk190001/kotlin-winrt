package Windows.UI.Xaml.Markup

import Windows.Foundation.Collections.IVector
import Windows.Storage.Streams.IRandomAccessStream
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

@ABIMarker(IXamlBinaryWriterStatics.ABI::class)
@Signature("{0d8ed07a-9b82-4aa8-b68b-026f2de1cc86}")
@Guid("0d8ed07a9b824aa8b68b026f2de1cc86")
@WinRTInterface("0d8ed07a9b824aa8b68b026f2de1cc86")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IXamlBinaryWriterStatics.ByReference::class)
public interface IXamlBinaryWriterStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Write(
    inputStreams: IVector<IRandomAccessStream?>?,
    outputStreams: IVector<IRandomAccessStream?>?,
    xamlMetadataProvider: IXamlMetadataProvider?
  ): XamlBinaryWriterErrorInformation?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IXamlBinaryWriterStatics> {
    public override fun getValue() = ABI.makeIXamlBinaryWriterStatics(pointer.getPointer(0))

    public fun setValue(value: IXamlBinaryWriterStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IXamlBinaryWriterStatics {
    public val __1489556863_Ptr: Pointer?

    public val _1489556863_VtblPtr: Pointer?
      get() = __1489556863_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Write(
      inputStreams: IVector<IRandomAccessStream?>?,
      outputStreams: IVector<IRandomAccessStream?>?,
      xamlMetadataProvider: IXamlMetadataProvider?
    ): XamlBinaryWriterErrorInformation? {
      val fnPtr = _1489556863_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XamlBinaryWriterErrorInformation>()
      val hr = fn.invokeHR(arrayOf(__1489556863_Ptr, marshalToNative(inputStreams),
          marshalToNative(outputStreams), marshalToNative(xamlMetadataProvider), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XamlBinaryWriterErrorInformation>(result.getValue())
      return resultValue
    }
  }

  public class IXamlBinaryWriterStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1489556863_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IXamlBinaryWriterStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0d8ed07a9b824aa8b68b026f2de1cc86")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIXamlBinaryWriterStatics(ptr: Pointer?): WithDefault =
        IXamlBinaryWriterStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IXamlBinaryWriterStatics {
      val address = segment.toRawLongValue()
      return makeIXamlBinaryWriterStatics(Pointer(address))
    }

    public override fun toNative(obj: IXamlBinaryWriterStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1489556863_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IXamlBinaryWriterStatics):
        Array<IXamlBinaryWriterStatics?> = (elements as
        Array<IXamlBinaryWriterStatics?>).castToImpl<IXamlBinaryWriterStatics,IXamlBinaryWriterStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXamlBinaryWriterStatics?> =
        arrayOfNulls<IXamlBinaryWriterStatics_Impl>(size) as Array<IXamlBinaryWriterStatics?>
  }
}
