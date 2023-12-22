package Windows.Graphics.Printing3D

import Windows.Storage.Streams.IRandomAccessStream
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(Printing3D3MFPackage.ABI::class)
@Signature("rc(Windows.Graphics.Printing3D.Printing3D3MFPackage;{f64dd5c8-2ab7-45a9-a1b7-267e948d5b18})")
@WinRTByReference(brClass = Printing3D3MFPackage.ByReference::class)
public class Printing3D3MFPackage(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPrinting3D3MFPackage.WithDefault, IPrinting3D3MFPackage2.WithDefault,
    IWinRTObject {
  private val __1545542539_Interface: IPrinting3D3MFPackage.WithDefault by lazy {
    as_1545542539()
  }


  private val __667178503_Interface: IPrinting3D3MFPackage2.WithDefault by lazy {
    as_667178503()
  }


  public override val __1545542539_Ptr: JNAPointer? by lazy {
    __1545542539_Interface.__1545542539_Ptr
  }


  public override val __667178503_Ptr: JNAPointer? by lazy {
    __667178503_Interface.__667178503_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1545542539_Interface, __667178503_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1545542539(): IPrinting3D3MFPackage.WithDefault {
    if(pointer == NULL) {
      return(IPrinting3D3MFPackage.ABI.makeIPrinting3D3MFPackage(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrinting3D3MFPackage>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrinting3D3MFPackage.ABI.makeIPrinting3D3MFPackage(ref.value))
  }

  private fun as_667178503(): IPrinting3D3MFPackage2.WithDefault {
    if(pointer == NULL) {
      return(IPrinting3D3MFPackage2.ABI.makeIPrinting3D3MFPackage2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrinting3D3MFPackage2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrinting3D3MFPackage2.ABI.makeIPrinting3D3MFPackage2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<Printing3D3MFPackage> {
    public override fun getValue() = Printing3D3MFPackage(pointer.getPointer(0))

    public fun setValue(value: Printing3D3MFPackage): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Printing3D3MFPackage, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IPrinting3D3MFPackageStatics_Instance: IPrinting3D3MFPackageStatics by lazy {
      createIPrinting3D3MFPackageStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Graphics.Printing3D.Printing3D3MFPackage".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public fun createIPrinting3D3MFPackageStatics(): IPrinting3D3MFPackageStatics {
      val refiid = Guid.REFIID(IPrinting3D3MFPackageStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Graphics.Printing3D.Printing3D3MFPackage".toHandle(),refiid,interfacePtr)
      val result =
          IPrinting3D3MFPackageStatics.ABI.makeIPrinting3D3MFPackageStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): Printing3D3MFPackage {
      val address = segment.toRawLongValue()
      return Printing3D3MFPackage(Pointer(address))
    }

    public override fun toNative(obj: Printing3D3MFPackage): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun LoadAsync(value: IRandomAccessStream) =
        ABI.IPrinting3D3MFPackageStatics_Instance.LoadAsync(value)
  }
}
