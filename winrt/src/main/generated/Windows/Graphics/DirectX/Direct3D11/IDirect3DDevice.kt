package Windows.Graphics.DirectX.Direct3D11

import Windows.Foundation.IClosable
import Windows.Foundation.IClosable.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(IDirect3DDevice.ABI::class)
@Signature("{a37624ab-8d5f-4650-9d3e-9eae3d9bc670}")
@Guid("a37624ab8d5f46509d3e9eae3d9bc670")
@WinRTInterface("a37624ab8d5f46509d3e9eae3d9bc670")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDirect3DDevice.ByReference::class)
public interface IDirect3DDevice : NativeMapped, IWinRTInterface, IClosable {
  @InterfaceMethod(0)
  public fun Trim(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDirect3DDevice> {
    public override fun getValue() = ABI.makeIDirect3DDevice(pointer.getPointer(0))

    public fun setValue(value: IDirect3DDevice_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDirect3DDevice, IClosable.WithDefault {
    public val __962826552_Ptr: Pointer?

    public val _962826552_VtblPtr: Pointer?
      get() = __962826552_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Trim(): Unit {
      val fnPtr = _962826552_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__962826552_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDirect3DDevice_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IClosable {
    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_962826552_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __962826552_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDirect3DDevice, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a37624ab8d5f46509d3e9eae3d9bc670")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDirect3DDevice(ptr: Pointer?): WithDefault = IDirect3DDevice_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDirect3DDevice {
      val address = segment.toRawLongValue()
      return makeIDirect3DDevice(Pointer(address))
    }

    public override fun toNative(obj: IDirect3DDevice): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__962826552_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDirect3DDevice): Array<IDirect3DDevice?> = (elements as
        Array<IDirect3DDevice?>).castToImpl<IDirect3DDevice,IDirect3DDevice_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDirect3DDevice?> =
        arrayOfNulls<IDirect3DDevice_Impl>(size) as Array<IDirect3DDevice?>
  }
}
