package Windows.Networking.Connectivity

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

@ABIMarker(IDataUsage.ABI::class)
@Signature("{c1431dd3-b146-4d39-b959-0c69b096c512}")
@Guid("c1431dd3b1464d39b9590c69b096c512")
@WinRTInterface("c1431dd3b1464d39b9590c69b096c512")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDataUsage.ByReference::class)
public interface IDataUsage : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_BytesSent(): WinDef.ULONG

  @InterfaceMethod(1)
  public fun get_BytesReceived(): WinDef.ULONG

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IDataUsage> {
    public override fun getValue() = ABI.makeIDataUsage(pointer.getPointer(0))

    public fun setValue(value: IDataUsage_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDataUsage {
    public val __542344756_Ptr: Pointer?

    public val _542344756_VtblPtr: Pointer?
      get() = __542344756_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_BytesSent(): WinDef.ULONG {
      val fnPtr = _542344756_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__542344756_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_BytesReceived(): WinDef.ULONG {
      val fnPtr = _542344756_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__542344756_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }
  }

  public class IDataUsage_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __542344756_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDataUsage, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c1431dd3b1464d39b9590c69b096c512")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDataUsage(ptr: Pointer?): WithDefault = IDataUsage_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDataUsage {
      val address = segment.toRawLongValue()
      return makeIDataUsage(Pointer(address))
    }

    public override fun toNative(obj: IDataUsage): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__542344756_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDataUsage): Array<IDataUsage?> = (elements as
        Array<IDataUsage?>).castToImpl<IDataUsage,IDataUsage_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDataUsage?> = arrayOfNulls<IDataUsage_Impl>(size)
        as Array<IDataUsage?>
  }
}
