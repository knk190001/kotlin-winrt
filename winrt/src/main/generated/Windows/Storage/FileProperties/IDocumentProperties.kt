package Windows.Storage.FileProperties

import Windows.Foundation.Collections.IVector
import Windows.Storage.FileProperties.IStorageItemExtraProperties.ABI.IID
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDocumentProperties.ABI::class)
@Signature("{7eab19bc-1821-4923-b4a9-0aea404d0070}")
@Guid("7eab19bc18214923b4a90aea404d0070")
@WinRTInterface("7eab19bc18214923b4a90aea404d0070")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDocumentProperties.ByReference::class)
public interface IDocumentProperties : NativeMapped, IWinRTInterface, IStorageItemExtraProperties {
  @InterfaceMethod(0)
  public fun get_Author(): IVector<String?>?

  @InterfaceMethod(1)
  public fun get_Title(): String?

  @InterfaceMethod(2)
  public fun put_Title(value: String?): Unit

  @InterfaceMethod(3)
  public fun get_Keywords(): IVector<String?>?

  @InterfaceMethod(4)
  public fun get_Comment(): String?

  @InterfaceMethod(5)
  public fun put_Comment(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDocumentProperties> {
    public override fun getValue() = ABI.makeIDocumentProperties(pointer.getPointer(0))

    public fun setValue(value: IDocumentProperties_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDocumentProperties, IStorageItemExtraProperties.WithDefault {
    public val __1860792342_Ptr: Pointer?

    public val _1860792342_VtblPtr: Pointer?
      get() = __1860792342_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Author(): IVector<String?>? {
      val fnPtr = _1860792342_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<String?>>()
      val hr = fn.invokeHR(arrayOf(__1860792342_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Title(): String? {
      val fnPtr = _1860792342_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1860792342_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_Title(value: String?): Unit {
      val fnPtr = _1860792342_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1860792342_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_Keywords(): IVector<String?>? {
      val fnPtr = _1860792342_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<String?>>()
      val hr = fn.invokeHR(arrayOf(__1860792342_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_Comment(): String? {
      val fnPtr = _1860792342_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1860792342_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_Comment(value: String?): Unit {
      val fnPtr = _1860792342_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1860792342_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDocumentProperties_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IStorageItemExtraProperties {
    public override val __1999536785_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1860792342_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1860792342_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDocumentProperties, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7eab19bc18214923b4a90aea404d0070")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDocumentProperties(ptr: Pointer?): WithDefault = IDocumentProperties_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDocumentProperties {
      val address = segment.toRawLongValue()
      return makeIDocumentProperties(Pointer(address))
    }

    public override fun toNative(obj: IDocumentProperties): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1860792342_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDocumentProperties): Array<IDocumentProperties?> =
        (elements as
        Array<IDocumentProperties?>).castToImpl<IDocumentProperties,IDocumentProperties_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDocumentProperties?> =
        arrayOfNulls<IDocumentProperties_Impl>(size) as Array<IDocumentProperties?>
  }
}
