package Microsoft.UI.Xaml.Controls

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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IIconSourceElementFactory.ABI::class)
@Signature("{13e1a240-ad47-51ae-9632-715f4b7ea52e}")
@Guid("13e1a240ad4751ae9632715f4b7ea52e")
@WinRTInterface("13e1a240ad4751ae9632715f4b7ea52e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IIconSourceElementFactory.ByReference::class)
public interface IIconSourceElementFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): IconSourceElement?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IIconSourceElementFactory> {
    public override fun getValue() = ABI.makeIIconSourceElementFactory(pointer.getPointer(0))

    public fun setValue(value: IIconSourceElementFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IIconSourceElementFactory {
    public val __1648778679_Ptr: Pointer?

    public val _1648778679_VtblPtr: Pointer?
      get() = __1648778679_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        IconSourceElement? {
      val fnPtr = _1648778679_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IconSourceElement>()
      val hr = fn.invokeHR(arrayOf(__1648778679_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IconSourceElement>(result.getValue())
      return resultValue
    }
  }

  public class IIconSourceElementFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1648778679_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IIconSourceElementFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("13e1a240ad4751ae9632715f4b7ea52e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIIconSourceElementFactory(ptr: Pointer?): WithDefault =
        IIconSourceElementFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IIconSourceElementFactory {
      val address = segment.toRawLongValue()
      return makeIIconSourceElementFactory(Pointer(address))
    }

    public override fun toNative(obj: IIconSourceElementFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1648778679_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IIconSourceElementFactory):
        Array<IIconSourceElementFactory?> = (elements as
        Array<IIconSourceElementFactory?>).castToImpl<IIconSourceElementFactory,IIconSourceElementFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IIconSourceElementFactory?> =
        arrayOfNulls<IIconSourceElementFactory_Impl>(size) as Array<IIconSourceElementFactory?>
  }
}
