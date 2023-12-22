package Windows.Graphics.Printing3D

import Windows.Graphics.Printing3D.IPrinting3DTexture2CoordMaterialGroupFactory.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
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
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(Printing3DTexture2CoordMaterialGroup.ABI::class)
@Signature("rc(Windows.Graphics.Printing3D.Printing3DTexture2CoordMaterialGroup;{627d7ca7-6d90-4fb9-9fc4-9feff3dfa892})")
@WinRTByReference(brClass = Printing3DTexture2CoordMaterialGroup.ByReference::class)
public class Printing3DTexture2CoordMaterialGroup(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPrinting3DTexture2CoordMaterialGroup.WithDefault,
    IPrinting3DTexture2CoordMaterialGroup2.WithDefault, IWinRTObject {
  private val __982442101_Interface: IPrinting3DTexture2CoordMaterialGroup.WithDefault by lazy {
    as_982442101()
  }


  private val __390934009_Interface: IPrinting3DTexture2CoordMaterialGroup2.WithDefault by lazy {
    as_390934009()
  }


  public override val __982442101_Ptr: JNAPointer? by lazy {
    __982442101_Interface.__982442101_Ptr
  }


  public override val __390934009_Ptr: JNAPointer? by lazy {
    __390934009_Interface.__390934009_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__982442101_Interface, __390934009_Interface)

  public constructor(MaterialGroupId: WinDef.UINT) : this(ABI.activate(MaterialGroupId))

  private fun as_982442101(): IPrinting3DTexture2CoordMaterialGroup.WithDefault {
    if(pointer == NULL) {
      return(IPrinting3DTexture2CoordMaterialGroup.ABI.makeIPrinting3DTexture2CoordMaterialGroup(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrinting3DTexture2CoordMaterialGroup>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrinting3DTexture2CoordMaterialGroup.ABI.makeIPrinting3DTexture2CoordMaterialGroup(ref.value))
  }

  private fun as_390934009(): IPrinting3DTexture2CoordMaterialGroup2.WithDefault {
    if(pointer == NULL) {
      return(IPrinting3DTexture2CoordMaterialGroup2.ABI.makeIPrinting3DTexture2CoordMaterialGroup2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrinting3DTexture2CoordMaterialGroup2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrinting3DTexture2CoordMaterialGroup2.ABI.makeIPrinting3DTexture2CoordMaterialGroup2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<Printing3DTexture2CoordMaterialGroup> {
    public override fun getValue() = Printing3DTexture2CoordMaterialGroup(pointer.getPointer(0))

    public fun setValue(value: Printing3DTexture2CoordMaterialGroup): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Printing3DTexture2CoordMaterialGroup, MemoryAddress> {
    public val IPrinting3DTexture2CoordMaterialGroupFactory_Instance:
        IPrinting3DTexture2CoordMaterialGroupFactory by lazy {
      createIPrinting3DTexture2CoordMaterialGroupFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPrinting3DTexture2CoordMaterialGroupFactory():
        IPrinting3DTexture2CoordMaterialGroupFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Graphics.Printing3D.Printing3DTexture2CoordMaterialGroup".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IPrinting3DTexture2CoordMaterialGroupFactory.ABI.makeIPrinting3DTexture2CoordMaterialGroupFactory(factoryActivatorPtr.value))
    }

    public fun activate(MaterialGroupId: WinDef.UINT): JNAPointer? =
        IPrinting3DTexture2CoordMaterialGroupFactory_Instance.Create(MaterialGroupId)?.pointer

    public override fun fromNative(segment: MemoryAddress): Printing3DTexture2CoordMaterialGroup {
      val address = segment.toRawLongValue()
      return Printing3DTexture2CoordMaterialGroup(Pointer(address))
    }

    public override fun toNative(obj: Printing3DTexture2CoordMaterialGroup): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
