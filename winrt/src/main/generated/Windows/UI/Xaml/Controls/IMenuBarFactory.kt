package Windows.UI.Xaml.Controls

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

@ABIMarker(IMenuBarFactory.ABI::class)
@Signature("{dc619e50-72ba-513f-80aa-ddd093825dde}")
@Guid("dc619e5072ba513f80aaddd093825dde")
@WinRTInterface("dc619e5072ba513f80aaddd093825dde")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMenuBarFactory.ByReference::class)
public interface IMenuBarFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): MenuBar?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMenuBarFactory> {
    public override fun getValue() = ABI.makeIMenuBarFactory(pointer.getPointer(0))

    public fun setValue(value: IMenuBarFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMenuBarFactory {
    public val __663805102_Ptr: Pointer?

    public val _663805102_VtblPtr: Pointer?
      get() = __663805102_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        MenuBar? {
      val fnPtr = _663805102_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MenuBar>()
      val hr = fn.invokeHR(arrayOf(__663805102_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MenuBar>(result.getValue())
      return resultValue
    }
  }

  public class IMenuBarFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __663805102_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMenuBarFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("dc619e5072ba513f80aaddd093825dde")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMenuBarFactory(ptr: Pointer?): WithDefault = IMenuBarFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMenuBarFactory {
      val address = segment.toRawLongValue()
      return makeIMenuBarFactory(Pointer(address))
    }

    public override fun toNative(obj: IMenuBarFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__663805102_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMenuBarFactory): Array<IMenuBarFactory?> = (elements as
        Array<IMenuBarFactory?>).castToImpl<IMenuBarFactory,IMenuBarFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMenuBarFactory?> =
        arrayOfNulls<IMenuBarFactory_Impl>(size) as Array<IMenuBarFactory?>
  }
}
