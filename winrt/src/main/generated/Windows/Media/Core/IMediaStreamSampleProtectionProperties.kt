package Windows.Media.Core

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
import com.github.knk190001.winrtbinding.runtime.interop.OutArray
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
import kotlin.Byte
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMediaStreamSampleProtectionProperties.ABI::class)
@Signature("{4eb88292-ecdf-493e-841d-dd4add7caca2}")
@Guid("4eb88292ecdf493e841ddd4add7caca2")
@WinRTInterface("4eb88292ecdf493e841ddd4add7caca2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaStreamSampleProtectionProperties.ByReference::class)
public interface IMediaStreamSampleProtectionProperties : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun SetKeyIdentifier(value: Array<Byte>): Unit

  @InterfaceMethod(1)
  public fun GetKeyIdentifier(value: OutArray<Byte>): Unit

  @InterfaceMethod(2)
  public fun SetInitializationVector(value: Array<Byte>): Unit

  @InterfaceMethod(3)
  public fun GetInitializationVector(value: OutArray<Byte>): Unit

  @InterfaceMethod(4)
  public fun SetSubSampleMapping(value: Array<Byte>): Unit

  @InterfaceMethod(5)
  public fun GetSubSampleMapping(value: OutArray<Byte>): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaStreamSampleProtectionProperties> {
    public override fun getValue() =
        ABI.makeIMediaStreamSampleProtectionProperties(pointer.getPointer(0))

    public fun setValue(value: IMediaStreamSampleProtectionProperties_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaStreamSampleProtectionProperties {
    public val __455253083_Ptr: Pointer?

    public val _455253083_VtblPtr: Pointer?
      get() = __455253083_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SetKeyIdentifier(value: Array<Byte>): Unit {
      val fnPtr = _455253083_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__455253083_Ptr, value.size,marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun GetKeyIdentifier(value: OutArray<Byte>): Unit {
      val fnPtr = _455253083_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__455253083_Ptr, value.size,marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun SetInitializationVector(value: Array<Byte>): Unit {
      val fnPtr = _455253083_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__455253083_Ptr, value.size,marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun GetInitializationVector(value: OutArray<Byte>): Unit {
      val fnPtr = _455253083_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__455253083_Ptr, value.size,marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun SetSubSampleMapping(value: Array<Byte>): Unit {
      val fnPtr = _455253083_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__455253083_Ptr, value.size,marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun GetSubSampleMapping(value: OutArray<Byte>): Unit {
      val fnPtr = _455253083_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__455253083_Ptr, value.size,marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMediaStreamSampleProtectionProperties_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __455253083_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaStreamSampleProtectionProperties, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4eb88292ecdf493e841ddd4add7caca2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaStreamSampleProtectionProperties(ptr: Pointer?): WithDefault =
        IMediaStreamSampleProtectionProperties_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaStreamSampleProtectionProperties {
      val address = segment.toRawLongValue()
      return makeIMediaStreamSampleProtectionProperties(Pointer(address))
    }

    public override fun toNative(obj: IMediaStreamSampleProtectionProperties): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__455253083_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaStreamSampleProtectionProperties):
        Array<IMediaStreamSampleProtectionProperties?> = (elements as
        Array<IMediaStreamSampleProtectionProperties?>).castToImpl<IMediaStreamSampleProtectionProperties,IMediaStreamSampleProtectionProperties_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaStreamSampleProtectionProperties?> =
        arrayOfNulls<IMediaStreamSampleProtectionProperties_Impl>(size) as
        Array<IMediaStreamSampleProtectionProperties?>
  }
}
