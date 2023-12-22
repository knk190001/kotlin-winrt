package Windows.UI.Xaml

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

@ABIMarker(IApplicationFactory.ABI::class)
@Signature("{93bbe361-be5a-4ee3-b4a3-95118dc97a89}")
@Guid("93bbe361be5a4ee3b4a395118dc97a89")
@WinRTInterface("93bbe361be5a4ee3b4a395118dc97a89")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IApplicationFactory.ByReference::class)
public interface IApplicationFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): Application?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IApplicationFactory> {
    public override fun getValue() = ABI.makeIApplicationFactory(pointer.getPointer(0))

    public fun setValue(value: IApplicationFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IApplicationFactory {
    public val __660062060_Ptr: Pointer?

    public val _660062060_VtblPtr: Pointer?
      get() = __660062060_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        Application? {
      val fnPtr = _660062060_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Application>()
      val hr = fn.invokeHR(arrayOf(__660062060_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Application>(result.getValue())
      return resultValue
    }
  }

  public class IApplicationFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __660062060_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IApplicationFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("93bbe361be5a4ee3b4a395118dc97a89")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIApplicationFactory(ptr: Pointer?): WithDefault = IApplicationFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IApplicationFactory {
      val address = segment.toRawLongValue()
      return makeIApplicationFactory(Pointer(address))
    }

    public override fun toNative(obj: IApplicationFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__660062060_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IApplicationFactory): Array<IApplicationFactory?> =
        (elements as
        Array<IApplicationFactory?>).castToImpl<IApplicationFactory,IApplicationFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IApplicationFactory?> =
        arrayOfNulls<IApplicationFactory_Impl>(size) as Array<IApplicationFactory?>
  }
}
