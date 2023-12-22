package Windows.Data.Xml.Dom

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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IXmlDomImplementation.ABI::class)
@Signature("{6de58132-f11d-4fbb-8cc6-583cba93112f}")
@Guid("6de58132f11d4fbb8cc6583cba93112f")
@WinRTInterface("6de58132f11d4fbb8cc6583cba93112f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IXmlDomImplementation.ByReference::class)
public interface IXmlDomImplementation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun HasFeature(feature: String?, version: IUnknown?): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IXmlDomImplementation> {
    public override fun getValue() = ABI.makeIXmlDomImplementation(pointer.getPointer(0))

    public fun setValue(value: IXmlDomImplementation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IXmlDomImplementation {
    public val __1288641844_Ptr: Pointer?

    public val _1288641844_VtblPtr: Pointer?
      get() = __1288641844_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun HasFeature(feature: String?, version: IUnknown?): Boolean {
      val fnPtr = _1288641844_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1288641844_Ptr, marshalToNative(feature),
          marshalToNative(version), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IXmlDomImplementation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1288641844_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IXmlDomImplementation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6de58132f11d4fbb8cc6583cba93112f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIXmlDomImplementation(ptr: Pointer?): WithDefault =
        IXmlDomImplementation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IXmlDomImplementation {
      val address = segment.toRawLongValue()
      return makeIXmlDomImplementation(Pointer(address))
    }

    public override fun toNative(obj: IXmlDomImplementation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1288641844_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IXmlDomImplementation): Array<IXmlDomImplementation?> =
        (elements as
        Array<IXmlDomImplementation?>).castToImpl<IXmlDomImplementation,IXmlDomImplementation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXmlDomImplementation?> =
        arrayOfNulls<IXmlDomImplementation_Impl>(size) as Array<IXmlDomImplementation?>
  }
}
