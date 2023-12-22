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

@ABIMarker(IAppBarFactory.ABI::class)
@Signature("{66b96b53-755b-5472-b2c4-8624e977d65b}")
@Guid("66b96b53755b5472b2c48624e977d65b")
@WinRTInterface("66b96b53755b5472b2c48624e977d65b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppBarFactory.ByReference::class)
public interface IAppBarFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): AppBar?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IAppBarFactory>
      {
    public override fun getValue() = ABI.makeIAppBarFactory(pointer.getPointer(0))

    public fun setValue(value: IAppBarFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppBarFactory {
    public val __794292207_Ptr: Pointer?

    public val _794292207_VtblPtr: Pointer?
      get() = __794292207_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        AppBar? {
      val fnPtr = _794292207_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppBar>()
      val hr = fn.invokeHR(arrayOf(__794292207_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppBar>(result.getValue())
      return resultValue
    }
  }

  public class IAppBarFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __794292207_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppBarFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("66b96b53755b5472b2c48624e977d65b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppBarFactory(ptr: Pointer?): WithDefault = IAppBarFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppBarFactory {
      val address = segment.toRawLongValue()
      return makeIAppBarFactory(Pointer(address))
    }

    public override fun toNative(obj: IAppBarFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__794292207_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppBarFactory): Array<IAppBarFactory?> = (elements as
        Array<IAppBarFactory?>).castToImpl<IAppBarFactory,IAppBarFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppBarFactory?> =
        arrayOfNulls<IAppBarFactory_Impl>(size) as Array<IAppBarFactory?>
  }
}
