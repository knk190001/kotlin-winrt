package Windows.UI.Xaml.Documents

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

@ABIMarker(IBlockFactory.ABI::class)
@Signature("{07110532-4f59-4f3b-9ce5-25784c430507}")
@Guid("071105324f594f3b9ce525784c430507")
@WinRTInterface("071105324f594f3b9ce525784c430507")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBlockFactory.ByReference::class)
public interface IBlockFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): Block?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IBlockFactory>
      {
    public override fun getValue() = ABI.makeIBlockFactory(pointer.getPointer(0))

    public fun setValue(value: IBlockFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBlockFactory {
    public val __776899099_Ptr: Pointer?

    public val _776899099_VtblPtr: Pointer?
      get() = __776899099_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        Block? {
      val fnPtr = _776899099_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Block>()
      val hr = fn.invokeHR(arrayOf(__776899099_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Block>(result.getValue())
      return resultValue
    }
  }

  public class IBlockFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __776899099_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBlockFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("071105324f594f3b9ce525784c430507")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBlockFactory(ptr: Pointer?): WithDefault = IBlockFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBlockFactory {
      val address = segment.toRawLongValue()
      return makeIBlockFactory(Pointer(address))
    }

    public override fun toNative(obj: IBlockFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__776899099_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBlockFactory): Array<IBlockFactory?> = (elements as
        Array<IBlockFactory?>).castToImpl<IBlockFactory,IBlockFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBlockFactory?> =
        arrayOfNulls<IBlockFactory_Impl>(size) as Array<IBlockFactory?>
  }
}
