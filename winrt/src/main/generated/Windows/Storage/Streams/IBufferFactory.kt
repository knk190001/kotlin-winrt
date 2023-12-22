package Windows.Storage.Streams

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

@ABIMarker(IBufferFactory.ABI::class)
@Signature("{71af914d-c10f-484b-bc50-14bc623b3a27}")
@Guid("71af914dc10f484bbc5014bc623b3a27")
@WinRTInterface("71af914dc10f484bbc5014bc623b3a27")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBufferFactory.ByReference::class)
public interface IBufferFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(capacity: WinDef.UINT): Buffer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IBufferFactory>
      {
    public override fun getValue() = ABI.makeIBufferFactory(pointer.getPointer(0))

    public fun setValue(value: IBufferFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBufferFactory {
    public val __176932054_Ptr: Pointer?

    public val _176932054_VtblPtr: Pointer?
      get() = __176932054_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(capacity: WinDef.UINT): Buffer? {
      val fnPtr = _176932054_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Buffer>()
      val hr = fn.invokeHR(arrayOf(__176932054_Ptr, capacity, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Buffer>(result.getValue())
      return resultValue
    }
  }

  public class IBufferFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __176932054_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBufferFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("71af914dc10f484bbc5014bc623b3a27")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBufferFactory(ptr: Pointer?): WithDefault = IBufferFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBufferFactory {
      val address = segment.toRawLongValue()
      return makeIBufferFactory(Pointer(address))
    }

    public override fun toNative(obj: IBufferFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__176932054_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBufferFactory): Array<IBufferFactory?> = (elements as
        Array<IBufferFactory?>).castToImpl<IBufferFactory,IBufferFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBufferFactory?> =
        arrayOfNulls<IBufferFactory_Impl>(size) as Array<IBufferFactory?>
  }
}
