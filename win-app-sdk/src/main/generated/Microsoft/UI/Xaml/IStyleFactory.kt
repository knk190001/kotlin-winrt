package Microsoft.UI.Xaml

import Windows.UI.Xaml.Interop.TypeName
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

@ABIMarker(IStyleFactory.ABI::class)
@Signature("{c2d924a2-3862-517c-b083-9a9120d7302d}")
@Guid("c2d924a23862517cb0839a9120d7302d")
@WinRTInterface("c2d924a23862517cb0839a9120d7302d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStyleFactory.ByReference::class)
public interface IStyleFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(targetType: TypeName?): Style?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IStyleFactory>
      {
    public override fun getValue() = ABI.makeIStyleFactory(pointer.getPointer(0))

    public fun setValue(value: IStyleFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStyleFactory {
    public val __1033136160_Ptr: Pointer?

    public val _1033136160_VtblPtr: Pointer?
      get() = __1033136160_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(targetType: TypeName?): Style? {
      val fnPtr = _1033136160_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Style>()
      val hr = fn.invokeHR(arrayOf(__1033136160_Ptr, marshalToNative(targetType), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Style>(result.getValue())
      return resultValue
    }
  }

  public class IStyleFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1033136160_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStyleFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c2d924a23862517cb0839a9120d7302d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStyleFactory(ptr: Pointer?): WithDefault = IStyleFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStyleFactory {
      val address = segment.toRawLongValue()
      return makeIStyleFactory(Pointer(address))
    }

    public override fun toNative(obj: IStyleFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1033136160_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStyleFactory): Array<IStyleFactory?> = (elements as
        Array<IStyleFactory?>).castToImpl<IStyleFactory,IStyleFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStyleFactory?> =
        arrayOfNulls<IStyleFactory_Impl>(size) as Array<IStyleFactory?>
  }
}
