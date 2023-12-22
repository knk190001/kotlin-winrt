package Windows.Data.Xml.Dom

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

@ABIMarker(IXmlNodeSerializer.ABI::class)
@Signature("{5cc5b382-e6dd-4991-abef-06d8d2e7bd0c}")
@Guid("5cc5b382e6dd4991abef06d8d2e7bd0c")
@WinRTInterface("5cc5b382e6dd4991abef06d8d2e7bd0c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IXmlNodeSerializer.ByReference::class)
public interface IXmlNodeSerializer : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetXml(): String?

  @InterfaceMethod(1)
  public fun get_InnerText(): String?

  @InterfaceMethod(2)
  public fun put_InnerText(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IXmlNodeSerializer> {
    public override fun getValue() = ABI.makeIXmlNodeSerializer(pointer.getPointer(0))

    public fun setValue(value: IXmlNodeSerializer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IXmlNodeSerializer {
    public val __849932908_Ptr: Pointer?

    public val _849932908_VtblPtr: Pointer?
      get() = __849932908_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetXml(): String? {
      val fnPtr = _849932908_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__849932908_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_InnerText(): String? {
      val fnPtr = _849932908_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__849932908_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_InnerText(value: String?): Unit {
      val fnPtr = _849932908_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__849932908_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IXmlNodeSerializer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __849932908_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IXmlNodeSerializer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5cc5b382e6dd4991abef06d8d2e7bd0c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIXmlNodeSerializer(ptr: Pointer?): WithDefault = IXmlNodeSerializer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IXmlNodeSerializer {
      val address = segment.toRawLongValue()
      return makeIXmlNodeSerializer(Pointer(address))
    }

    public override fun toNative(obj: IXmlNodeSerializer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__849932908_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IXmlNodeSerializer): Array<IXmlNodeSerializer?> =
        (elements as
        Array<IXmlNodeSerializer?>).castToImpl<IXmlNodeSerializer,IXmlNodeSerializer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXmlNodeSerializer?> =
        arrayOfNulls<IXmlNodeSerializer_Impl>(size) as Array<IXmlNodeSerializer?>
  }
}
