package Windows.Data.Xml.Dom

import Windows.Storage.Streams.IBuffer
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

@ABIMarker(IXmlDocumentIO2.ABI::class)
@Signature("{5d034661-7bd8-4ad5-9ebf-81e6347263b1}")
@Guid("5d0346617bd84ad59ebf81e6347263b1")
@WinRTInterface("5d0346617bd84ad59ebf81e6347263b1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IXmlDocumentIO2.ByReference::class)
public interface IXmlDocumentIO2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun LoadXmlFromBuffer(buffer: IBuffer?): Unit

  @InterfaceMethod(1)
  public fun LoadXmlFromBuffer(buffer: IBuffer?, loadSettings: XmlLoadSettings?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IXmlDocumentIO2> {
    public override fun getValue() = ABI.makeIXmlDocumentIO2(pointer.getPointer(0))

    public fun setValue(value: IXmlDocumentIO2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IXmlDocumentIO2 {
    public val __986489969_Ptr: Pointer?

    public val _986489969_VtblPtr: Pointer?
      get() = __986489969_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun LoadXmlFromBuffer(buffer: IBuffer?): Unit {
      val fnPtr = _986489969_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__986489969_Ptr, marshalToNative(buffer),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun LoadXmlFromBuffer(buffer: IBuffer?, loadSettings: XmlLoadSettings?): Unit {
      val fnPtr = _986489969_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__986489969_Ptr, marshalToNative(buffer),
          marshalToNative(loadSettings),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IXmlDocumentIO2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __986489969_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IXmlDocumentIO2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5d0346617bd84ad59ebf81e6347263b1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIXmlDocumentIO2(ptr: Pointer?): WithDefault = IXmlDocumentIO2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IXmlDocumentIO2 {
      val address = segment.toRawLongValue()
      return makeIXmlDocumentIO2(Pointer(address))
    }

    public override fun toNative(obj: IXmlDocumentIO2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__986489969_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IXmlDocumentIO2): Array<IXmlDocumentIO2?> = (elements as
        Array<IXmlDocumentIO2?>).castToImpl<IXmlDocumentIO2,IXmlDocumentIO2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXmlDocumentIO2?> =
        arrayOfNulls<IXmlDocumentIO2_Impl>(size) as Array<IXmlDocumentIO2?>
  }
}
