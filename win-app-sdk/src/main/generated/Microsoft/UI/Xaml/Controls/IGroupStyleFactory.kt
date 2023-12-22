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

@ABIMarker(IGroupStyleFactory.ABI::class)
@Signature("{dc884aa2-e2a8-57ab-8cbc-b1d8ec540b0c}")
@Guid("dc884aa2e2a857ab8cbcb1d8ec540b0c")
@WinRTInterface("dc884aa2e2a857ab8cbcb1d8ec540b0c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGroupStyleFactory.ByReference::class)
public interface IGroupStyleFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): GroupStyle?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGroupStyleFactory> {
    public override fun getValue() = ABI.makeIGroupStyleFactory(pointer.getPointer(0))

    public fun setValue(value: IGroupStyleFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGroupStyleFactory {
    public val __1476645039_Ptr: Pointer?

    public val _1476645039_VtblPtr: Pointer?
      get() = __1476645039_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        GroupStyle? {
      val fnPtr = _1476645039_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GroupStyle>()
      val hr = fn.invokeHR(arrayOf(__1476645039_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GroupStyle>(result.getValue())
      return resultValue
    }
  }

  public class IGroupStyleFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1476645039_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGroupStyleFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("dc884aa2e2a857ab8cbcb1d8ec540b0c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGroupStyleFactory(ptr: Pointer?): WithDefault = IGroupStyleFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGroupStyleFactory {
      val address = segment.toRawLongValue()
      return makeIGroupStyleFactory(Pointer(address))
    }

    public override fun toNative(obj: IGroupStyleFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1476645039_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGroupStyleFactory): Array<IGroupStyleFactory?> =
        (elements as
        Array<IGroupStyleFactory?>).castToImpl<IGroupStyleFactory,IGroupStyleFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGroupStyleFactory?> =
        arrayOfNulls<IGroupStyleFactory_Impl>(size) as Array<IGroupStyleFactory?>
  }
}
