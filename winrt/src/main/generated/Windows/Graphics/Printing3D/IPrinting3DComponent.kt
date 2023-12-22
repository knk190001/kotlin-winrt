package Windows.Graphics.Printing3D

import Windows.Foundation.Collections.IVector
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPrinting3DComponent.ABI::class)
@Signature("{7e287845-bf7f-4cdb-a27f-30a01437fede}")
@Guid("7e287845bf7f4cdba27f30a01437fede")
@WinRTInterface("7e287845bf7f4cdba27f30a01437fede")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrinting3DComponent.ByReference::class)
public interface IPrinting3DComponent : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Mesh(): Printing3DMesh?

  @InterfaceMethod(1)
  public fun put_Mesh(value: Printing3DMesh?): Unit

  @InterfaceMethod(2)
  public fun get_Components(): IVector<Printing3DComponentWithMatrix?>?

  @InterfaceMethod(3)
  public fun get_Thumbnail(): Printing3DTextureResource?

  @InterfaceMethod(4)
  public fun put_Thumbnail(value: Printing3DTextureResource?): Unit

  @InterfaceMethod(5)
  public fun get_Type(): Printing3DObjectType?

  @InterfaceMethod(6)
  public fun put_Type(value: Printing3DObjectType?): Unit

  @InterfaceMethod(7)
  public fun get_Name(): String?

  @InterfaceMethod(8)
  public fun put_Name(value: String?): Unit

  @InterfaceMethod(9)
  public fun get_PartNumber(): String?

  @InterfaceMethod(10)
  public fun put_PartNumber(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrinting3DComponent> {
    public override fun getValue() = ABI.makeIPrinting3DComponent(pointer.getPointer(0))

    public fun setValue(value: IPrinting3DComponent_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrinting3DComponent {
    public val __297460532_Ptr: Pointer?

    public val _297460532_VtblPtr: Pointer?
      get() = __297460532_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Mesh(): Printing3DMesh? {
      val fnPtr = _297460532_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Printing3DMesh>()
      val hr = fn.invokeHR(arrayOf(__297460532_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Printing3DMesh>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Mesh(value: Printing3DMesh?): Unit {
      val fnPtr = _297460532_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__297460532_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Components(): IVector<Printing3DComponentWithMatrix?>? {
      val fnPtr = _297460532_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<Printing3DComponentWithMatrix?>>()
      val hr = fn.invokeHR(arrayOf(__297460532_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVector<Printing3DComponentWithMatrix?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Thumbnail(): Printing3DTextureResource? {
      val fnPtr = _297460532_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Printing3DTextureResource>()
      val hr = fn.invokeHR(arrayOf(__297460532_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Printing3DTextureResource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_Thumbnail(value: Printing3DTextureResource?): Unit {
      val fnPtr = _297460532_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__297460532_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_Type(): Printing3DObjectType? {
      val fnPtr = _297460532_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Printing3DObjectType>()
      val hr = fn.invokeHR(arrayOf(__297460532_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Printing3DObjectType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun put_Type(value: Printing3DObjectType?): Unit {
      val fnPtr = _297460532_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__297460532_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_Name(): String? {
      val fnPtr = _297460532_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__297460532_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun put_Name(value: String?): Unit {
      val fnPtr = _297460532_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__297460532_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_PartNumber(): String? {
      val fnPtr = _297460532_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__297460532_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun put_PartNumber(value: String?): Unit {
      val fnPtr = _297460532_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__297460532_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPrinting3DComponent_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __297460532_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrinting3DComponent, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7e287845bf7f4cdba27f30a01437fede")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrinting3DComponent(ptr: Pointer?): WithDefault = IPrinting3DComponent_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrinting3DComponent {
      val address = segment.toRawLongValue()
      return makeIPrinting3DComponent(Pointer(address))
    }

    public override fun toNative(obj: IPrinting3DComponent): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__297460532_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrinting3DComponent): Array<IPrinting3DComponent?> =
        (elements as
        Array<IPrinting3DComponent?>).castToImpl<IPrinting3DComponent,IPrinting3DComponent_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrinting3DComponent?> =
        arrayOfNulls<IPrinting3DComponent_Impl>(size) as Array<IPrinting3DComponent?>
  }
}
