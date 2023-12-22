package Windows.UI.StartScreen

import Windows.Foundation.Uri
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(SecondaryTile.ABI::class)
@Signature("rc(Windows.UI.StartScreen.SecondaryTile;{9e9e51e0-2bb5-4bc0-bb8d-42b23abcc88d})")
@WinRTByReference(brClass = SecondaryTile.ByReference::class)
public class SecondaryTile(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISecondaryTile.WithDefault, ISecondaryTile2.WithDefault, IWinRTObject {
  private val __19566616_Interface: ISecondaryTile.WithDefault by lazy {
    as_19566616()
  }


  private val __606565146_Interface: ISecondaryTile2.WithDefault by lazy {
    as_606565146()
  }


  public override val __19566616_Ptr: JNAPointer? by lazy {
    __19566616_Interface.__19566616_Ptr
  }


  public override val __606565146_Ptr: JNAPointer? by lazy {
    __606565146_Interface.__606565146_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__19566616_Interface, __606565146_Interface)

  public constructor() : this(ABI.activate())

  public constructor(
    tileId: String,
    shortName: String,
    displayName: String,
    arguments: String,
    tileOptions: TileOptions,
    logoReference: Uri
  ) : this(ABI.activate(tileId, shortName, displayName, arguments, tileOptions, logoReference))

  public constructor(
    tileId: String,
    shortName: String,
    displayName: String,
    arguments: String,
    tileOptions: TileOptions,
    logoReference: Uri,
    wideLogoReference: Uri
  ) : this(ABI.activate(tileId, shortName, displayName, arguments, tileOptions, logoReference,
      wideLogoReference))

  public constructor(tileId: String) : this(ABI.activate(tileId))

  public constructor(
    tileId: String,
    displayName: String,
    arguments: String,
    square150x150Logo: Uri,
    desiredSize: TileSize
  ) : this(ABI.activate(tileId, displayName, arguments, square150x150Logo, desiredSize))

  private fun as_19566616(): ISecondaryTile.WithDefault {
    if(pointer == NULL) {
      return(ISecondaryTile.ABI.makeISecondaryTile(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISecondaryTile>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISecondaryTile.ABI.makeISecondaryTile(ref.value))
  }

  private fun as_606565146(): ISecondaryTile2.WithDefault {
    if(pointer == NULL) {
      return(ISecondaryTile2.ABI.makeISecondaryTile2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISecondaryTile2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISecondaryTile2.ABI.makeISecondaryTile2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<SecondaryTile>
      {
    public override fun getValue() = SecondaryTile(pointer.getPointer(0))

    public fun setValue(value: SecondaryTile): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SecondaryTile, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val ISecondaryTileStatics_Instance: ISecondaryTileStatics by lazy {
      createISecondaryTileStatics()
    }


    public val ISecondaryTileFactory_Instance: ISecondaryTileFactory by lazy {
      createISecondaryTileFactory()
    }


    public val ISecondaryTileFactory2_Instance: ISecondaryTileFactory2 by lazy {
      createISecondaryTileFactory2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.UI.StartScreen.SecondaryTile".toHandle(),
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

    public fun createISecondaryTileStatics(): ISecondaryTileStatics {
      val refiid = Guid.REFIID(ISecondaryTileStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.StartScreen.SecondaryTile".toHandle(),refiid,interfacePtr)
      val result = ISecondaryTileStatics.ABI.makeISecondaryTileStatics(interfacePtr.value)
      return result
    }

    public fun createISecondaryTileFactory(): ISecondaryTileFactory {
      val refiid = Guid.REFIID(ISecondaryTileFactory.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.StartScreen.SecondaryTile".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ISecondaryTileFactory.ABI.makeISecondaryTileFactory(factoryActivatorPtr.value))
    }

    public fun createISecondaryTileFactory2(): ISecondaryTileFactory2 {
      val refiid = Guid.REFIID(ISecondaryTileFactory2.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.StartScreen.SecondaryTile".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ISecondaryTileFactory2.ABI.makeISecondaryTileFactory2(factoryActivatorPtr.value))
    }

    public fun activate(
      tileId: String,
      shortName: String,
      displayName: String,
      arguments: String,
      tileOptions: TileOptions,
      logoReference: Uri
    ): JNAPointer? = ISecondaryTileFactory_Instance.CreateTile(tileId, shortName, displayName,
        arguments, tileOptions, logoReference)?.pointer

    public fun activate(
      tileId: String,
      shortName: String,
      displayName: String,
      arguments: String,
      tileOptions: TileOptions,
      logoReference: Uri,
      wideLogoReference: Uri
    ): JNAPointer? = ISecondaryTileFactory_Instance.CreateWideTile(tileId, shortName, displayName,
        arguments, tileOptions, logoReference, wideLogoReference)?.pointer

    public fun activate(tileId: String): JNAPointer? =
        ISecondaryTileFactory_Instance.CreateWithId(tileId)?.pointer

    public fun activate(
      tileId: String,
      displayName: String,
      arguments: String,
      square150x150Logo: Uri,
      desiredSize: TileSize
    ): JNAPointer? = ISecondaryTileFactory2_Instance.CreateMinimalTile(tileId, displayName,
        arguments, square150x150Logo, desiredSize)?.pointer

    public override fun fromNative(segment: MemoryAddress): SecondaryTile {
      val address = segment.toRawLongValue()
      return SecondaryTile(Pointer(address))
    }

    public override fun toNative(obj: SecondaryTile): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun Exists(tileId: String) = ABI.ISecondaryTileStatics_Instance.Exists(tileId)

    public fun FindAllAsync() = ABI.ISecondaryTileStatics_Instance.FindAllAsync()

    public fun FindAllAsync(applicationId: String) =
        ABI.ISecondaryTileStatics_Instance.FindAllAsync(applicationId)

    public fun FindAllForPackageAsync() =
        ABI.ISecondaryTileStatics_Instance.FindAllForPackageAsync()
  }
}
