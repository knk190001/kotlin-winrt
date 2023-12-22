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

@ABIMarker(IDirect3DSurface.ABI::class)
@Signature("{0bf4a146-13c1-4694-bee3-7abf15eaf586}")
@Guid("0bf4a14613c14694bee37abf15eaf586")
@WinRTInterface("0bf4a14613c14694bee37abf15eaf586")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDirect3DSurface.ByReference::class)
public interface IDirect3DSurface : NativeMapped, IWinRTInterface, IClosable {
  @InterfaceMethod(0)
  public fun get_Description(): Direct3DSurfaceDescription?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDirect3DSurface> {
    public override fun getValue() = ABI.makeIDirect3DSurface(pointer.getPointer(0))

    public fun setValue(value: IDirect3DSurface_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDirect3DSurface, IClosable.WithDefault {
    public val __1099082363_Ptr: Pointer?

    public val _1099082363_VtblPtr: Pointer?
      get() = __1099082363_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Description(): Direct3DSurfaceDescription? {
      val fnPtr = _1099082363_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Direct3DSurfaceDescription>()
      val hr = fn.invokeHR(arrayOf(__1099082363_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Direct3DSurfaceDescription>(result.getValue())
      return resultValue
    }
  }

  public class IDirect3DSurface_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IClosable {
    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1099082363_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1099082363_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDirect3DSurface, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0bf4a14613c14694bee37abf15eaf586")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDirect3DSurface(ptr: Pointer?): WithDefault = IDirect3DSurface_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDirect3DSurface {
      val address = segment.toRawLongValue()
      return makeIDirect3DSurface(Pointer(address))
    }

    public override fun toNative(obj: IDirect3DSurface): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1099082363_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDirect3DSurface): Array<IDirect3DSurface?> = (elements as
        Array<IDirect3DSurface?>).castToImpl<IDirect3DSurface,IDirect3DSurface_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDirect3DSurface?> =
        arrayOfNulls<IDirect3DSurface_Impl>(size) as Array<IDirect3DSurface?>
  }
}
