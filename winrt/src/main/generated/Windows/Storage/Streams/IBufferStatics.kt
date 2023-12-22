package Windows.Storage.Streams

import Windows.Foundation.IMemoryBuffer
import Windows.Foundation.MemoryBuffer
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

@ABIMarker(IBufferStatics.ABI::class)
@Signature("{e901e65b-d716-475a-a90a-af7229b1e741}")
@Guid("e901e65bd716475aa90aaf7229b1e741")
@WinRTInterface("e901e65bd716475aa90aaf7229b1e741")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBufferStatics.ByReference::class)
public interface IBufferStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateCopyFromMemoryBuffer(input: IMemoryBuffer?): Buffer?

  @InterfaceMethod(1)
  public fun CreateMemoryBufferOverIBuffer(input: IBuffer?): MemoryBuffer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IBufferStatics>
      {
    public override fun getValue() = ABI.makeIBufferStatics(pointer.getPointer(0))

    public fun setValue(value: IBufferStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBufferStatics {
    public val __628321391_Ptr: Pointer?

    public val _628321391_VtblPtr: Pointer?
      get() = __628321391_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateCopyFromMemoryBuffer(input: IMemoryBuffer?): Buffer? {
      val fnPtr = _628321391_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Buffer>()
      val hr = fn.invokeHR(arrayOf(__628321391_Ptr, marshalToNative(input), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Buffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateMemoryBufferOverIBuffer(input: IBuffer?): MemoryBuffer? {
      val fnPtr = _628321391_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MemoryBuffer>()
      val hr = fn.invokeHR(arrayOf(__628321391_Ptr, marshalToNative(input), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MemoryBuffer>(result.getValue())
      return resultValue
    }
  }

  public class IBufferStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __628321391_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBufferStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e901e65bd716475aa90aaf7229b1e741")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBufferStatics(ptr: Pointer?): WithDefault = IBufferStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBufferStatics {
      val address = segment.toRawLongValue()
      return makeIBufferStatics(Pointer(address))
    }

    public override fun toNative(obj: IBufferStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__628321391_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBufferStatics): Array<IBufferStatics?> = (elements as
        Array<IBufferStatics?>).castToImpl<IBufferStatics,IBufferStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBufferStatics?> =
        arrayOfNulls<IBufferStatics_Impl>(size) as Array<IBufferStatics?>
  }
}
