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

@ABIMarker(IBuffer.ABI::class)
@Signature("{905a0fe0-bc53-11df-8c49-001e4fc686da}")
@Guid("905a0fe0bc5311df8c49001e4fc686da")
@WinRTInterface("905a0fe0bc5311df8c49001e4fc686da")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBuffer.ByReference::class)
public interface IBuffer : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Capacity(): WinDef.UINT

  @InterfaceMethod(1)
  public fun get_Length(): WinDef.UINT

  @InterfaceMethod(2)
  public fun put_Length(value: WinDef.UINT): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IBuffer> {
    public override fun getValue() = ABI.makeIBuffer(pointer.getPointer(0))

    public fun setValue(value: IBuffer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBuffer {
    public val __1607707244_Ptr: Pointer?

    public val _1607707244_VtblPtr: Pointer?
      get() = __1607707244_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Capacity(): WinDef.UINT {
      val fnPtr = _1607707244_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1607707244_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_Length(): WinDef.UINT {
      val fnPtr = _1607707244_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1607707244_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun put_Length(value: WinDef.UINT): Unit {
      val fnPtr = _1607707244_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1607707244_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IBuffer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1607707244_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBuffer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("905a0fe0bc5311df8c49001e4fc686da")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBuffer(ptr: Pointer?): WithDefault = IBuffer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBuffer {
      val address = segment.toRawLongValue()
      return makeIBuffer(Pointer(address))
    }

    public override fun toNative(obj: IBuffer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1607707244_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBuffer): Array<IBuffer?> = (elements as
        Array<IBuffer?>).castToImpl<IBuffer,IBuffer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBuffer?> = arrayOfNulls<IBuffer_Impl>(size) as
        Array<IBuffer?>
  }
}
