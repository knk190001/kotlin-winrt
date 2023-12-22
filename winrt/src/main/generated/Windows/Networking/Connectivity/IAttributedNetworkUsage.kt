package Windows.Networking.Connectivity

import Windows.Storage.Streams.IRandomAccessStreamReference
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAttributedNetworkUsage.ABI::class)
@Signature("{f769b039-eca2-45eb-ade1-b0368b756c49}")
@Guid("f769b039eca245ebade1b0368b756c49")
@WinRTInterface("f769b039eca245ebade1b0368b756c49")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAttributedNetworkUsage.ByReference::class)
public interface IAttributedNetworkUsage : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_BytesSent(): WinDef.ULONG

  @InterfaceMethod(1)
  public fun get_BytesReceived(): WinDef.ULONG

  @InterfaceMethod(2)
  public fun get_AttributionId(): String?

  @InterfaceMethod(3)
  public fun get_AttributionName(): String?

  @InterfaceMethod(4)
  public fun get_AttributionThumbnail(): IRandomAccessStreamReference?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAttributedNetworkUsage> {
    public override fun getValue() = ABI.makeIAttributedNetworkUsage(pointer.getPointer(0))

    public fun setValue(value: IAttributedNetworkUsage_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAttributedNetworkUsage {
    public val __1641571714_Ptr: Pointer?

    public val _1641571714_VtblPtr: Pointer?
      get() = __1641571714_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_BytesSent(): WinDef.ULONG {
      val fnPtr = _1641571714_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__1641571714_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_BytesReceived(): WinDef.ULONG {
      val fnPtr = _1641571714_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__1641571714_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_AttributionId(): String? {
      val fnPtr = _1641571714_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1641571714_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_AttributionName(): String? {
      val fnPtr = _1641571714_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1641571714_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_AttributionThumbnail(): IRandomAccessStreamReference? {
      val fnPtr = _1641571714_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IRandomAccessStreamReference>()
      val hr = fn.invokeHR(arrayOf(__1641571714_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IRandomAccessStreamReference>(result.getValue())
      return resultValue
    }
  }

  public class IAttributedNetworkUsage_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1641571714_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAttributedNetworkUsage, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f769b039eca245ebade1b0368b756c49")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAttributedNetworkUsage(ptr: Pointer?): WithDefault =
        IAttributedNetworkUsage_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAttributedNetworkUsage {
      val address = segment.toRawLongValue()
      return makeIAttributedNetworkUsage(Pointer(address))
    }

    public override fun toNative(obj: IAttributedNetworkUsage): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1641571714_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAttributedNetworkUsage): Array<IAttributedNetworkUsage?>
        = (elements as
        Array<IAttributedNetworkUsage?>).castToImpl<IAttributedNetworkUsage,IAttributedNetworkUsage_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAttributedNetworkUsage?> =
        arrayOfNulls<IAttributedNetworkUsage_Impl>(size) as Array<IAttributedNetworkUsage?>
  }
}
