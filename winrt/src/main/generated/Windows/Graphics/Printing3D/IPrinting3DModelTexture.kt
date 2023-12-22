package Windows.Graphics.Printing3D

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

@ABIMarker(IPrinting3DModelTexture.ABI::class)
@Signature("{5dafcf01-b59d-483c-97bb-a4d546d1c75c}")
@Guid("5dafcf01b59d483c97bba4d546d1c75c")
@WinRTInterface("5dafcf01b59d483c97bba4d546d1c75c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrinting3DModelTexture.ByReference::class)
public interface IPrinting3DModelTexture : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TextureResource(): Printing3DTextureResource?

  @InterfaceMethod(1)
  public fun put_TextureResource(value: Printing3DTextureResource?): Unit

  @InterfaceMethod(2)
  public fun get_TileStyleU(): Printing3DTextureEdgeBehavior?

  @InterfaceMethod(3)
  public fun put_TileStyleU(value: Printing3DTextureEdgeBehavior?): Unit

  @InterfaceMethod(4)
  public fun get_TileStyleV(): Printing3DTextureEdgeBehavior?

  @InterfaceMethod(5)
  public fun put_TileStyleV(value: Printing3DTextureEdgeBehavior?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrinting3DModelTexture> {
    public override fun getValue() = ABI.makeIPrinting3DModelTexture(pointer.getPointer(0))

    public fun setValue(value: IPrinting3DModelTexture_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrinting3DModelTexture {
    public val __2108029827_Ptr: Pointer?

    public val _2108029827_VtblPtr: Pointer?
      get() = __2108029827_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TextureResource(): Printing3DTextureResource? {
      val fnPtr = _2108029827_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Printing3DTextureResource>()
      val hr = fn.invokeHR(arrayOf(__2108029827_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Printing3DTextureResource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_TextureResource(value: Printing3DTextureResource?): Unit {
      val fnPtr = _2108029827_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2108029827_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_TileStyleU(): Printing3DTextureEdgeBehavior? {
      val fnPtr = _2108029827_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Printing3DTextureEdgeBehavior>()
      val hr = fn.invokeHR(arrayOf(__2108029827_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Printing3DTextureEdgeBehavior>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_TileStyleU(value: Printing3DTextureEdgeBehavior?): Unit {
      val fnPtr = _2108029827_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2108029827_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_TileStyleV(): Printing3DTextureEdgeBehavior? {
      val fnPtr = _2108029827_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Printing3DTextureEdgeBehavior>()
      val hr = fn.invokeHR(arrayOf(__2108029827_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Printing3DTextureEdgeBehavior>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_TileStyleV(value: Printing3DTextureEdgeBehavior?): Unit {
      val fnPtr = _2108029827_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2108029827_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPrinting3DModelTexture_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2108029827_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrinting3DModelTexture, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5dafcf01b59d483c97bba4d546d1c75c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrinting3DModelTexture(ptr: Pointer?): WithDefault =
        IPrinting3DModelTexture_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrinting3DModelTexture {
      val address = segment.toRawLongValue()
      return makeIPrinting3DModelTexture(Pointer(address))
    }

    public override fun toNative(obj: IPrinting3DModelTexture): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2108029827_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrinting3DModelTexture): Array<IPrinting3DModelTexture?>
        = (elements as
        Array<IPrinting3DModelTexture?>).castToImpl<IPrinting3DModelTexture,IPrinting3DModelTexture_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrinting3DModelTexture?> =
        arrayOfNulls<IPrinting3DModelTexture_Impl>(size) as Array<IPrinting3DModelTexture?>
  }
}
