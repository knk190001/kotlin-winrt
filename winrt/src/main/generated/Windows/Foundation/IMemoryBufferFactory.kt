package Windows.Foundation

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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IMemoryBufferFactory.ABI::class)
@Signature("{fbc4dd2b-245b-11e4-af98-689423260cf8}")
@Guid("fbc4dd2b245b11e4af98689423260cf8")
@WinRTInterface("fbc4dd2b245b11e4af98689423260cf8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMemoryBufferFactory.ByReference::class)
public interface IMemoryBufferFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(capacity: WinDef.UINT): MemoryBuffer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMemoryBufferFactory> {
    public override fun getValue() = ABI.makeIMemoryBufferFactory(pointer.getPointer(0))

    public fun setValue(value: IMemoryBufferFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMemoryBufferFactory {
    public val __407740510_Ptr: Pointer?

    public val _407740510_VtblPtr: Pointer?
      get() = __407740510_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(capacity: WinDef.UINT): MemoryBuffer? {
      val fnPtr = _407740510_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MemoryBuffer>()
      val hr = fn.invokeHR(arrayOf(__407740510_Ptr, capacity, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MemoryBuffer>(result.getValue())
      return resultValue
    }
  }

  public class IMemoryBufferFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __407740510_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMemoryBufferFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fbc4dd2b245b11e4af98689423260cf8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMemoryBufferFactory(ptr: Pointer?): WithDefault = IMemoryBufferFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMemoryBufferFactory {
      val address = segment.toRawLongValue()
      return makeIMemoryBufferFactory(Pointer(address))
    }

    public override fun toNative(obj: IMemoryBufferFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__407740510_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMemoryBufferFactory): Array<IMemoryBufferFactory?> =
        (elements as
        Array<IMemoryBufferFactory?>).castToImpl<IMemoryBufferFactory,IMemoryBufferFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMemoryBufferFactory?> =
        arrayOfNulls<IMemoryBufferFactory_Impl>(size) as Array<IMemoryBufferFactory?>
  }
}
