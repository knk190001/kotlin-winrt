package Windows.ApplicationModel.DataTransfer

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IKeyValuePair
import Windows.Foundation.Collections.IMap
import Windows.Foundation.Collections.IVector
import Windows.Foundation.Uri
import Windows.Storage.Streams.IRandomAccessStreamReference
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.DynamicSignature
import com.github.knk190001.winrtbinding.runtime.annotations.GenericType
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.TypeHash
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.KType
import kotlin.reflect.KTypeProjection
import kotlin.reflect.KVariance
import kotlin.reflect.KVariance.INVARIANT
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@GenericType
@DynamicSignature
@ABIMarker(IDataPackagePropertySet.ABI::class)
@Guid("cd1c93eb4c4c443aa8d3f5c241e91689")
@WinRTByReference(IDataPackagePropertySet.ByReference::class)
@TypeHash("__1132950341_Type")
public interface IDataPackagePropertySet : NativeMapped, IWinRTInterface, IMap<String?, IUnknown?>,
    IIterable<IKeyValuePair<String?, IUnknown?>?> {
  public val __1132950341_Ptr: Pointer?

  public val _1132950341_VtblPtr: Pointer?
    get() = __1132950341_Ptr?.getPointer(0)

  public override val __8028824_Type: KType
    get() = IMap::class.createType(listOf(
      KTypeProjection(INVARIANT,String::class.createType()),
      KTypeProjection(INVARIANT,IUnknown::class.createType()),
    ))

  public override val __1449643190_Type: KType
    get() = IIterable::class.createType(listOf(
      KTypeProjection(INVARIANT,IKeyValuePair::class.createType(listOf(
        KTypeProjection(INVARIANT,String::class.createType()),
        KTypeProjection(INVARIANT,IUnknown::class.createType()),
      ))),
    ))

  public fun get_Title(): String?

  public fun put_Title(value: String?): Unit

  public fun get_Description(): String?

  public fun put_Description(value: String?): Unit

  public fun get_Thumbnail(): IRandomAccessStreamReference?

  public fun put_Thumbnail(value: IRandomAccessStreamReference?): Unit

  public fun get_FileTypes(): IVector<String?>?

  public fun get_ApplicationName(): String?

  public fun put_ApplicationName(value: String?): Unit

  public fun get_ApplicationListingUri(): Uri?

  public fun put_ApplicationListingUri(value: Uri?): Unit

  public interface WithDefault : IDataPackagePropertySet {
    public override fun get_Title(): String? {
      val fnPtr = _1132950341_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1132950341_Ptr,result))
      if( hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val returnType = String::class.createType()
      return marshalFromNative<String>(result.getValue(), returnType!!)
    }

    public override fun put_Title(value: String?): Unit {
      val fnPtr = _1132950341_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr)
      val hr = fn.invokeHR(arrayOf(__1132950341_Ptr,marshalToNative(value)))
      if( hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    public override fun get_Description(): String? {
      val fnPtr = _1132950341_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1132950341_Ptr,result))
      if( hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val returnType = String::class.createType()
      return marshalFromNative<String>(result.getValue(), returnType!!)
    }

    public override fun put_Description(value: String?): Unit {
      val fnPtr = _1132950341_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr)
      val hr = fn.invokeHR(arrayOf(__1132950341_Ptr,marshalToNative(value)))
      if( hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    public override fun get_Thumbnail(): IRandomAccessStreamReference? {
      val fnPtr = _1132950341_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr)
      val result = makeByReferenceType<IRandomAccessStreamReference>()
      val hr = fn.invokeHR(arrayOf(__1132950341_Ptr,result))
      if( hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val returnType = IRandomAccessStreamReference::class.createType()
      return marshalFromNative<IRandomAccessStreamReference>(result.getValue(), returnType!!)
    }

    public override fun put_Thumbnail(value: IRandomAccessStreamReference?): Unit {
      val fnPtr = _1132950341_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr)
      val hr = fn.invokeHR(arrayOf(__1132950341_Ptr,marshalToNative(value)))
      if( hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    public override fun get_FileTypes(): IVector<String?>? {
      val fnPtr = _1132950341_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr)
      val result = makeByReferenceType<IVector<String?>>(
      IVector::class.createType(listOf(
        KTypeProjection(INVARIANT,String::class.createType()),
      )))
      val hr = fn.invokeHR(arrayOf(__1132950341_Ptr,result))
      if( hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val returnType = IVector::class.createType(listOf(
        KTypeProjection(INVARIANT,String::class.createType()),
      ))
      return marshalFromNative<IVector<String?>>(result.getValue(), returnType!!)
    }

    public override fun get_ApplicationName(): String? {
      val fnPtr = _1132950341_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1132950341_Ptr,result))
      if( hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val returnType = String::class.createType()
      return marshalFromNative<String>(result.getValue(), returnType!!)
    }

    public override fun put_ApplicationName(value: String?): Unit {
      val fnPtr = _1132950341_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr)
      val hr = fn.invokeHR(arrayOf(__1132950341_Ptr,marshalToNative(value)))
      if( hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    public override fun get_ApplicationListingUri(): Uri? {
      val fnPtr = _1132950341_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__1132950341_Ptr,result))
      if( hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val returnType = Uri::class.createType()
      return marshalFromNative<Uri>(result.getValue(), returnType!!)
    }

    public override fun put_ApplicationListingUri(value: Uri?): Unit {
      val fnPtr = _1132950341_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr)
      val hr = fn.invokeHR(arrayOf(__1132950341_Ptr,marshalToNative(value)))
      if( hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDataPackagePropertySet> {
    public override fun getValue(): IDataPackagePropertySet =
        ABI.makeIDataPackagePropertySet(pointer.getPointer(0))

    public fun setValue(value: IDataPackagePropertySet): Unit {
      pointer = value.__1132950341_Ptr!!
    }
  }

  public class IDataPackagePropertySetImpl(
    ptr: JNAPointer? = NULL
  ) : PointerType(ptr), WithDefault {
    public override val __1132950341_Ptr: JNAPointer?
      get() = pointer

    public override val _1132950341_VtblPtr: JNAPointer?
      get() = pointer.getPointer(0)

    public override val __8028824_Ptr: JNAPointer? by lazy { 
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(guidOf<IMap<String?, IUnknown?>>())
      val result = PointerByReference()
      IUnknownVtbl(_1132950341_VtblPtr).queryInterface(pointer, refiid, result)
      result.value
    }


    public override val __1449643190_Ptr: JNAPointer? by lazy { 
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(guidOf<IIterable<IKeyValuePair<String?,
          IUnknown?>?>>())
      val result = PointerByReference()
      IUnknownVtbl(_1132950341_VtblPtr).queryInterface(pointer, refiid, result)
      result.value
    }


    public companion object {
      public operator fun invoke(ptr: JNAPointer?): IDataPackagePropertySet =
          IDataPackagePropertySetImpl(ptr)
    }
  }

  public object ABI : IABI<IDataPackagePropertySet, MemoryAddress> {
    public override val layout: ValueLayout = ADDRESS

    public fun makeIDataPackagePropertySet(ptr: JNAPointer?) = IDataPackagePropertySetImpl( ptr)

    public override fun fromNative(segment: MemoryAddress): IDataPackagePropertySet {
      val address = segment.toRawLongValue()
      return makeIDataPackagePropertySet(Pointer(address))
    }

    public override fun toNative(obj: IDataPackagePropertySet): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1132950341_Ptr))
  }
}
